package com.horizon.javabase.Demo5CallStyle.ObserverDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Observable {
    private ArrayList mArrayList = new ArrayList();
    public Observable just(String ...items ){
        for (String item:items) {
           mArrayList.add(item);
        }
        MySingleBus.getNextList(mArrayList);
        return this;
    }

    public Observable subscribe(Observer observer){
        MySingleBus.setObserver(observer, this);
        return this;
    }
}
