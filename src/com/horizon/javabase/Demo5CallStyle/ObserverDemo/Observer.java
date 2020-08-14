package com.horizon.javabase.Demo5CallStyle.ObserverDemo;

public interface Observer {
    /**
     * 注册
     */
    void onScribe(Observable observable);
    /**
     * 下一个事件
     */
    void onNext(String s);
    void onError();
    void onComplete();
}
