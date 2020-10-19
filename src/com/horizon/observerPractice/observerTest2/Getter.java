package com.horizon.observerPractice.observerTest2;

public class Getter {
    private static void out(String s){
        System.out.println(s);
    }
    private G0Data mData;
    public void getData(){
        if(mData!=null) {
            new Thread ((Runnable) () -> {
                for (int i = 0; i < 10; i++) {
//                    delay(200);
                    out(i + "Getter:" + mData.sendData());
                }
            }).start();
        }else {
            out("Null");
        }
    }

    public void setData(G0Data data){
        mData = data;
        getData();
    }
    public interface G0Data {
        String sendData();
    }

    private void delay(int i){
        for (int j = 0; j < i*100000; j++) {
            System.out.print("");
        }
    }
}
