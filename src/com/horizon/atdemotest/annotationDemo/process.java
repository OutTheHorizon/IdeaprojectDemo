package com.horizon.atdemotest.annotationDemo;

import javax.naming.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class process{
    public static void main(String[] args) {
        Act act = new Act();
        System.out.println("1" + act.mDemo);
        act = (Act) process(act, new Object[]{2});
        System.out.println(act.mDemo.getA());
    }

    private static Object process(Object o, Object[] objects){
        //获得所有玩意儿
        Field[] fields = o.getClass().getDeclaredFields();
        //对每一个看看有没有特定注解
        for (Field field : fields) {
            if (field.isAnnotationPresent(AutoNew.class)) {
                try {
                    AutoNew anno = field.getAnnotation(AutoNew.class);
                    //基于类型注入
                    Class<?> type = field.getType();
                    Constructor<?> con = type.getConstructor(int.class);
                    Object value = con.newInstance(objects);

                    field.setAccessible(true);
                    field.set(o, value);
                    return o;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
