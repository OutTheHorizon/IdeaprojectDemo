package com.horizon.javabase.Demo9Thread;

public class MutliThread implements Runnable{
    private int ticket= 100; //每个线程都拥有100张票
    private String name;
    public MutliThread(){}
    public MutliThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        while (ticket>0){
            System.out.println(ticket-- + "is saled by "+ name);
        }
    }
}
