package com.horizon.javabase.Demo4Destionation;

public class Parcel7 {
    public static void main(String []args){
        String str="";
        str = getMessage(new NiMingClass() {
            @Override
            public String getMessage() {
                return "张三";
            }
        });
        System.out.println(str);
    }
    public static String getMessage(NiMingClass niMingClass){
        return niMingClass.getMessage();
    }
}
