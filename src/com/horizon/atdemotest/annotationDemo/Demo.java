package com.horizon.atdemotest.annotationDemo;

public class Demo {
    public int a=0;
    public Demo(int a){
        System.out.println("Process Demo New ");
        this.a = a;
    }
    public int getA(){
        return a;
    }
}
