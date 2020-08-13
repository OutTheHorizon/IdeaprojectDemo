package com.horizon.javabase.Demo7Class;

public class Ps2 {
    private String name;
    private int age;
    public Ps2(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }

    public Ps2(){
        super();
        System.out.println("person run");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
