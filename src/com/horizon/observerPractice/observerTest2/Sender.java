package com.horizon.observerPractice.observerTest2;

public class Sender {
    String s;
    void init(String s){
        this.s= "发送者数据:"+s;
    }

    void setGetter(Getter getter){
        getter.setData(new Getter.G0Data() {
            @Override
            public String sendData() {
                return s;
            }
        });
    }

    void  setGetter1(Getter1 getter1){
        getter1.setData(() -> s);
    }
}
