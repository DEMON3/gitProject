package mainProcess;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Field;

/**
 * Created by WY on 2017/2/28.
 */
public class GenerateRowMapper {
    public static void main(String[] args) throws FileNotFoundException {
        File fileName = new File("/Users/wy/IdeaProjects/JDBCPre/src/main/resources/file.txt");
        PrintWriter outFile = null;
        outFile = new PrintWriter(fileName);
        outFile.write("");

        Class t ;
        t = DiabetesVec.class;
        //generateRowMapper(t,outFile);
        generateClass(outFile);



        outFile.flush();
        outFile.close();

    }
    public static void generateClass(PrintWriter outFile){

        StringBuilder sb  = new StringBuilder();
        for(int i = 1 ; i <=3300;i++){
            sb.append(" public int item"+i+" ;\n ");
        }
        outFile.write(sb.toString());

    }
    public static void generateSql(PrintWriter outFile){
        String sql = " create table train_vec  ( ";
        StringBuilder sb  = new StringBuilder();
        for(int i = 1 ; i <=3300;i++){
            sb.append(" item"+i+" number default 0 , ");
        }
        sql +=sb.toString();
        sql += " ) ";
        outFile.write(sql);

    }
    public static void generateRowMapper(Class t,PrintWriter outFile){
        Field [] fields = t.getFields();
        for(Field field :fields){
            String output = "record.";
            String parameter = field.getName();
            String firstParam = field.getName().substring(0,1);
            String param = field.getName().substring(1);
            String setName = "rs.";
            String typeName = "";
            String oraginalTypeName = field.getType().getName();
            String []typeArray = oraginalTypeName.split("\\.");
            typeName = typeArray[typeArray.length-1];
            String realTypeName = "";
            switch (typeName){
                case "double": realTypeName = "getDouble";break;
                case "Double": realTypeName = "getDouble";break;
                case "String": realTypeName = "getString";break;
                case "Integer": realTypeName = "getInt";break;
                case "int": realTypeName = "getInt";break;
                case "Date": realTypeName = "getDate";break;
            }

            output+= "set"+firstParam.toUpperCase()+param+"("+setName+realTypeName+"(\""+parameter.toUpperCase()+"\")"+");\n"      ;
            System.out.println(output);
            outFile.write(output);

        }


    }


}
