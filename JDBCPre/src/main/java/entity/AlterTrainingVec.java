package entity;

import mainProcess.TrainingVec;

import java.lang.reflect.Field;

/**
 * Created by wy on 2018/1/26.
 */
public class AlterTrainingVec {
    public static void doAlter(String code , TrainingVec vec, int value) throws NoSuchFieldException, IllegalAccessException {
        Field alter = TrainingVec.class.getField(code);
        alter.setAccessible(true);
        alter.setInt(vec,value);
    }
    public static int getValue(String code , TrainingVec vec) throws NoSuchFieldException, IllegalAccessException {
        Field alter = TrainingVec.class.getField(code);
        alter.setAccessible(true);
        return alter.getInt(vec);
    }

}
