package com.horizon.javabase.Demo5CallStyle.ObserverDemo;

import java.util.ArrayList;

public class MySingleBus {
    private static Observer mObserver;
    private static ArrayList<String> mArrayList;
    private volatile static MySingleBus mHandle;
    private MySingleBus(){}
    public static MySingleBus getDefault(){
        if(mHandle == null){
            synchronized (MySingleBus.class){
                if(mHandle == null){
                    mHandle = new MySingleBus();
                }
            }
        }
        return mHandle;
    }

    public static void setObserver(Observer observer, Observable observable){
        mObserver = observer;
        mObserver.onScribe(observable);
        if(mObserver!=null){
            for (int i = 0; i < mArrayList.size(); i++) {
                mObserver.onNext(mArrayList.get(i));
            }
            mObserver.onComplete();
        }
    }

    /**
     * 每次OnNext处理的事件？
     */
    public static void getNextList(ArrayList<String> arrayList){
        mArrayList = arrayList;
    }
}
