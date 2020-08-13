package com.horizon.javabase.Demo7Class;

public class Ps {
    private String name;
    private int age;
    public Ps(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }

    public Ps(){
        super();
        System.out.println("person run");
    }

    public void show(){
        System.out.println("person show run");
    }

    public static void staticShow(){
        System.out.println("person static show run");
    }

    public void paramShow(String name, int age){
        System.out.println("show"+name+"--"+age);
    }

}
