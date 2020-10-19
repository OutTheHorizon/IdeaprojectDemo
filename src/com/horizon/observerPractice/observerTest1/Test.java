package com.horizon.observerPractice.observerTest1;

public class Test {
    //此时将发送类写成带有接口的类
    public static void main(String[] args) {
        Getter getter = new Getter();
        Sender sender = new Sender();
        Getter1 getter1 = new Getter1();

        sender.init("第一次数据");
        getter.init(sender);
        System.out.println( getter.outS());

        getter1.init(sender);
        System.out.println( getter1.outS());

        getter.init(sender);
        System.out.println( getter.outS());
    }
}
