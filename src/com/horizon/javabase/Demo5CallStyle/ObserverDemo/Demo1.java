package com.horizon.javabase.Demo5CallStyle.ObserverDemo;

import java.awt.*;

public class Demo1 {
    public static void main(String[] args){
        Observer observer = new Observer() {
            @Override
            public void onScribe(Observable observable) {
                System.out.println("我把菜单给厨师了");
            }

            @Override
            public void onNext(String s) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("菜品"+s+"已经完成");
                    }
                }).start();
            }

            @Override
            public void onError() {

            }

            @Override
            public void onComplete() {
                System.out.println("没菜可以做了");
            }
        };
//        Observable observable = new Observable();
//        observable.just("梅菜扣肉","韩式饺子")
//                .subscribe(observer);

        new Observable().just("hahha","jahah","jkdjkf","jdkf")
                .subscribe(new Observer() {
                    @Override
                    public void onScribe(Observable observable) {
                        System.out.println("Scribe");
                    }

                    @Override
                    public void onNext(String s) {
                        System.out.println(s);
                    }

                    @Override
                    public void onError() {

                    }

                    @Override
                    public void onComplete() {
                        System.out.println("complete");
                    }
                });
    }

    public static void delay(long mm){
        for (int i = 0; i < mm*1000000; i++) { ; }
    }
}
