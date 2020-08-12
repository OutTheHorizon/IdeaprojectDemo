package com.horizon.javabase.Demo4Destionation;

import javax.security.auth.callback.TextOutputCallback;

public class Parcel8 {
    private String sex;
    public static String name="chenssy";

    //静态内部类
    static class InnerClass{
        //在静态内部类可以存在静态成员
        public static String name1 = "chenssy_static";
        public void display(){
            /**
             * 静态内部类只能访问外围类的静态成员变量和方法
             * 不能访问外围类的非静态成员变量和方法
             */
            System.out.println("OutClass name:"+name);
        }
    }

    class InnerClass2{
        //在静态内部类可以存在静态成员
        public String name1 = "chenssy_inner";
        public void display(){
            System.out.println("OutClass name:"+name);
        }
    }

    public void display(){
        //外围类访问静态内部类：内部类
        System.out.println(InnerClass.name1);
        //静态内部类 可以直接创建实例不需要依赖于外部类
        new InnerClass().display();

        new InnerClass2().display();
        //非静态内部类的创建需要依赖于外围类
//        Parcel8.InnerClass2 inner2 = new Parcel8.InnerClass2();
//        /**
//         * 方位非静态内部类的成员需要使用非晶态内部类的实例
//         */
//        System.out.println(inner2.name1);
//        System.out.println();
//        inner2.display();

    }
}
