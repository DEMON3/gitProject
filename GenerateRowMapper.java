package org.ailab.report.reportCommon.dailySummaryQuary;

import org.apache.poi.hwpf.usermodel.Fields;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Field;

/**
 * Created by WY on 2017/2/28.
 */
public class GenerateRowMapper {
    public static void main(String[] args) throws FileNotFoundException {
        Class t ;
        t = InpDailySummary.class;
        Field [] fields = t.getFields();
        File fileName = new File("F://file/file.txt");
        PrintWriter outFile = null;
        outFile = new PrintWriter(fileName);
        outFile.write("");

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
                case "String": realTypeName = "getString";break;
                case "int": realTypeName = "getInt";break;
                case "Date": realTypeName = "getDate";break;
            }

             output+= "set"+firstParam.toUpperCase()+param+"("+setName+realTypeName+"(\""+parameter.toUpperCase()+"\")"+");\n"      ;
            System.out.println(output);
            outFile.write(output);

        }
        outFile.flush();
        outFile.close();

    }
}
