package com.horizon.observerPractice.observerTest1;

public class Getter1 {
    //作为主线程想要获得主类的数据
    //假设主类已经初始化
    private String getS;
    public void init(Sender sender){
        sender.setData(new Sender.Data() {
            @Override
            public void sendData(String s) {
                //获得数据
                getS = s+"Get2";
            }
        });
    }

    public String  outS(){
        return getS;
    }
}
