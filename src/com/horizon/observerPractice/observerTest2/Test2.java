package com.horizon.observerPractice.observerTest2;

public class Test2 {
    private static void out(String s){
        System.out.println(s);
    }
    //此时将发送类写成带有接口的类
    public static void main(String[] args) {
        Getter getter = new Getter();
        Getter1 getter1 = new Getter1();
        Sender sender = new Sender();

        sender.init("发送数据");
        sender.setGetter(getter);
        sender.setGetter1(getter1);

        //添加这个原因是没有缓冲区，"发送数据"的数据来不及输出就因为接口的刷新而抛弃了该数据。
        //显示"发送数据"要么是0个，要么是2个，要么全是。说明数据的更换的时间就在那一刹那。正好是16个数据显示的时间
        // （虽然替换接口是一瞬间，但是接口重写却需要不少时间）。
        for (int i = 0; i < 95000; i++) {
            System.out.print("");
        }
        sender.init("jls");
        sender.setGetter(getter);
        sender.setGetter1(getter1);
    }
}
