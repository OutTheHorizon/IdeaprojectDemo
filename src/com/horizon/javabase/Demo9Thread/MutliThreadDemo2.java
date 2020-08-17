package com.horizon.javabase.Demo9Thread;

public class MutliThreadDemo2 {
    public static void main(String[] args){
        MutliThread2 m = new MutliThread2();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);
        t1.start();
        t2.start();
        t3.start();
    }
}
