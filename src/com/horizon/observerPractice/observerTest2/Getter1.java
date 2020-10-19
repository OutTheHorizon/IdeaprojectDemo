package com.horizon.observerPractice.observerTest2;

public class Getter1 {
    private static void out(String s){
        System.out.println(s);
    }
    private G1Data mData;
    public void getData(){
        if(mData!=null) {
            new Thread ((Runnable) () -> {
                for (int i = 0; i < 10; i++) {
//                    delay(100);
                    out(i + "Getter1:" + mData.sendData());
                }
            }).start();
        }else {
            out("Null");
        }
    }

    public void setData(G1Data data){
        mData = data;
        getData();
    }
    public interface G1Data {
        String sendData();
    }

    private void delay(int i){
        for (int j = 0; j < i*100000; j++) {
            System.out.print("");
        }
    }
}
