package com.horizon.javabase.Demo9Thread;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName()+"休眠0.5秒!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前运行的线程名称: "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread mt1 = new MyThread();
        Thread th = new Thread(mt1, "线程A");
        System.out.println("\n Thread is starting");
        th.start();
        Thread.sleep(1000);
        System.out.println("\n主线程已经休眠2s "+Thread.currentThread().getName());
    }
}
