package com.horizon.javabase.Demo5CallStyle;

public interface Demo5CallBack {
    /**
     * 这个是小李知道答案时要调用的函数告诉小王，也就是会回调函数
     * @param result 是答案
     */

    public void solve(String result);
}
