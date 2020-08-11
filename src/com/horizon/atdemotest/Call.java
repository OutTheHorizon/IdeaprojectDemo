package com.horizon.atdemotest;

public interface Call<T> {
    public void enqueue(CallBack<T> callBack);
}
