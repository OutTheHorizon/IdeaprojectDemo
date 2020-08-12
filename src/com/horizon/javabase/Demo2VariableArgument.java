package com.horizon.javabase;

public class Demo2VariableArgument {

    public String toString(){
        return "jk";
    }

    public static void main(String []args){
        printArgumentInfo("111","222","333");
        System.out.println( add(1,2,3,4,54,5));
        Demo2VariableArgument demo2VariableArgument= new Demo2VariableArgument();
        System.out.println(demo2VariableArgument.toString());
    }

    public static void printArgumentInfo(String ... strings){
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Strings"+(i+1)+":"+strings[i]);
        }
    }

    public static int add(int x, int ... args){
        int sum=x;
        for (int i = 0; i < args.length; i++) {
            sum +=args[i];
        }
        return sum;
    }
}
