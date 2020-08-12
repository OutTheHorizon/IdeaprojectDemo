package com.horizon.javabase.Demo4Destionation;


//测试类
public class Parcel5 {
    //定义在方法里(我TM看起来还以为是类名，原来是方法啊。)
    public Destination mDestination(String str){
        class PDestination implements Destination {
            private String label;
            private PDestination(String whereTo){
                label = whereTo;
            }

            public String readLabel(){
                return label;
            }
        }
        return new PDestination(str);
    }

    public static void main(String []args){
        Parcel5 parcel5 = new Parcel5();
        Destination d= parcel5.mDestination("chenssy");
        String str = d.readLabel();
        System.out.println(str);
    }
}
