package com.horizon.javabase.Demo9Thread;

public class MutliThreadDemo {
    /**
     * 线程的建立 1。用Runnable直接写run方法，然后调用Thread进程
     *          2。直接继承Thread（Thread上方实际上有一个线程池）。
     * @param args
     */
    public static void main(String[] args){
        MutliThread m1 = new MutliThread("Window 1");
        MutliThread m2 = new MutliThread("Window 2");
        MutliThread m3 = new MutliThread("Window 3");
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);
        t1.start();
        t2.start();
        t3.start();
    }
}
