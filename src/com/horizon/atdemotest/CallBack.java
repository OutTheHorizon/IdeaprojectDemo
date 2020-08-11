package com.horizon.atdemotest;

public interface CallBack<T> {
    public void onResponse(Call<T> call,  Response<T> response);
}
