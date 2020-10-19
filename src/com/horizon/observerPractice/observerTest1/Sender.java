package com.horizon.observerPractice.observerTest1;

public class Sender {
    private String personData;
    public void init(String s){
        personData = s+"数据发送了";
    }

    public void setData(Data data){
        data.sendData(personData);
    }
    public interface Data{
        void sendData(String s);
    }
}
