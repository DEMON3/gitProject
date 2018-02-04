package mainProcess;

import com.google.gson.Gson;
import entity.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;

import javax.json.Json;

/**
 * Created by wy on 2018/1/26.
 */
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("oracle.jdbc.driver.OracleDriver");

        // 1. Get a connection to database
        Connection conn = DriverManager.getConnection ("jdbc:oracle:thin:@223.3.123.196:1521:wy","wy" , "1234");
        //Connection ist = DriverManager.getConnection ("jdbc:oracle:thin:@223.3.74.162:1521:wy","wy" , "1234");
        //Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@223.3.71.149:1521:mic", "mic", "tjjk1234");

        // 2. Create a statement
        Statement myStmt = conn.createStatement();
        Statement istST = conn.createStatement();

        // 3. Execute SQL query
        try {

            List<ItemMap> itemMapList = new ArrayList<>();
            List<String> label = new ArrayList<>();
            Map<String,String> keyItemMap = new HashMap<>();
            Map<String,String> itemKeyMap = new HashMap<>();
            Map<String,ItemMap> itemMap = new HashMap<>();
            //1 得到映射表
            {
                String qSql = " Select * from item_map t   ";

                //		"where t.billing_date >= to_date ('"+str+"','yyyy-mm-dd') and t.billing_date <= to_date ('"+end+"','yyyy-mm-dd') ";
                WyRowMapper wyMapper = new ItemMapRowMapper();
                ResultSet myRs = myStmt.executeQuery(qSql);
                itemMapList = wyMapper.getList(myRs);
                for (ItemMap ddm: itemMapList
                        ) {
                    keyItemMap.put(ddm.getItemId(),ddm.getItemCode());
                    itemKeyMap.put(ddm.getItemCode(),ddm.getItemId());
                    itemMap.put(ddm.getItemCode(),ddm);
                }

            }
            List<DiabetesSettleGenl> diabetesSettleGenlList = new ArrayList<>();
            //2 得到所有的 genl 记录
            {
                String qSql = " Select * from Diabetes_Settle_genl_mon1 t  where rownum<4   ";
                //		"where t.billing_date >= to_date ('"+str+"','yyyy-mm-dd') and t.billing_date <= to_date ('"+end+"','yyyy-mm-dd') ";
                WyRowMapper wyMapper = new DiabetesSettleGenlRowMapper();
                ResultSet myRs = myStmt.executeQuery(qSql);
                diabetesSettleGenlList = wyMapper.getList(myRs);
                System.out.println(diabetesSettleGenlList.size());
            }
            //3 buildMap
            //用于训练的Map， 这一步只将key加入map，下一步添加value
            Map<String,DiabetesVec> map = new HashMap<>();
            {
                for(DiabetesSettleGenl cur:diabetesSettleGenlList){
                    String key = cur.getMedicare_registration_id();
                    label.add(key);
                    if(!map.containsKey(key)) {
                        DiabetesVec value = new DiabetesVec();
                        map.put(key, value);
                        java.util.Date cvD = cur.getBilling_date();
                        value.setMedicareRegisterationID(key);
                        value.setBillingDate(cvD);
                        value.setBillingCount(1);
                    }else{
                        DiabetesVec value = map.get(key);
                        java.util.Date cvD = value.getBillingDate();
                        if(cvD.compareTo(cur.getBilling_date())<0){
                            value.setBillingDate(cur.getBilling_date());
                        }
                        value.setBillingCount(value.getBillingCount()+1);
                    }
                }
            }
            //4 buildVec
            //这一步要过滤掉中药为主的治疗方式
            List<TrainingVec> trainingVecList = new ArrayList<>();
            Set<String> keySet = map.keySet();
            List<List<Double>> relateScoreList = new ArrayList<>();
            List<List<Integer>> trainingList1 = new ArrayList<>();
            List<List<Integer>> trainingList2 = new ArrayList<>();
            Map<String,List<Integer>> trainingMap = new HashMap<>();

            for (String curKey : keySet) {
                DiabetesVec cur = map.get(curKey);
                String qSql = " Select * from Diabetes_script_item_mon1 t where t.medicare_registration_id = '"+cur.getMedicareRegisterationID()+"' ";
                WyRowMapper wyMapper = new DiabetesScriptItemRowMapper();
                ResultSet myRs = myStmt.executeQuery(qSql);
                List<DiabetesScriptItem> diabetesScriptItemList;
                diabetesScriptItemList = wyMapper.getList(myRs);
                System.out.println(diabetesScriptItemList.size());
                // stat feature
                StatFeature statFeature = cur.getStatFeature();
                // cur.relateScore;
                int score = 0;

                //TrainingVEC
                List<Integer> attrList1 = new ArrayList<>();
                List<Integer> attrList2 = new ArrayList<>();
                TrainingVec vec = cur.getTrainingVec();
                double count =0;//记录总条数
                double sumCount =0;//记录总条数
                double relateCount =0;//记录总条数
                double chineseCount =0 ;//记录中药条数
                for (DiabetesScriptItem item :
                        diabetesScriptItemList) {
                    sumCount++;
                    String itemCode = item.getItem_code();
                    itemCode = itemKeyMap.get(itemCode);
                    if(item.getBill_item_code().indexOf("A")>0) count++;
                    if(item.getBill_item_code()=="A30") chineseCount++;
                    if(itemCode !=null) {
                        int curScore =  itemMap.get(item.getItem_code()).getRelateScore();
                        score += curScore;
                        if(curScore>0) relateCount++;
                        int value = AlterTrainingVec.getValue(itemCode, vec);
                        value = (int) (value + item.getQuantity());
                        AlterTrainingVec.doAlter(itemCode, vec, value);
                        //   System.out.println("brov~!!!!");
                    }
                }
                if(sumCount==0) sumCount=1;
                cur.setRelateScore(score);
                cur.setRelatePercent(relateCount/sumCount);
                List<Double> tempList = new ArrayList<>();
                tempList.add((double)score);
                tempList.add(cur.getRelatePercent());
                relateScoreList.add(tempList);
                if(count==0) count=1;
                if(chineseCount/count>0.5){
                    map.remove(curKey);
                }else {
                    trainingVecList.add(cur.getTrainingVec());
                    for (int i = 1; i <= 3300; i++) {
                        String curAttr = "item"+i;
                        int attr = AlterTrainingVec.getValue(curAttr,vec);
                        attrList2.add(attr);
                        attr = attr > 0?1:0;
                        attrList1.add(attr);
                    }
                    trainingList1.add(attrList1);
                    trainingList2.add(attrList2);

                 //   trainingMap.put(curKey,attrList1);

                }
            }
            String basePath = "F:/WY/gitProject-master/JDBCPre/src/main/resources/";
            generateJsonFile(new File(basePath+"label.json"),label);
            generateJsonFile(new File(basePath+"train.json"),map);
            generateJsonFile(new File(basePath+"trainingList1.json"),trainingList1);
            generateJsonFile(new File(basePath+"trainingList2.json"),trainingList2);
            generateJsonFile(new File(basePath+"relateScore.json"),relateScoreList);
            System.out.println(trainingVecList.size());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            conn.close();
        }
    }



    public static void  generateJsonFile(File fileName, Object object ) throws FileNotFoundException {
        Gson gson = new Gson();
        PrintWriter outFile = null;
        outFile = new PrintWriter(fileName);
        try {
            outFile.write("");
            outFile.write(gson.toJson(object));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        outFile.flush();
        outFile.close();
    }
}
