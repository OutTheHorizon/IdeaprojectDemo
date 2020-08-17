package com.horizon.javabase.Demo9Thread;

public class MutliThread2 implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (ticket>0) {
            System.out.println(Thread.currentThread() + " has always saled " + ticket-- + " tickets");
        }
    }
}
