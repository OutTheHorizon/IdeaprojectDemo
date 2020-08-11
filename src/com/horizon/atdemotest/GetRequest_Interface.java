package com.horizon.atdemotest;

public interface GetRequest_Interface {
    @Get("url")
    Call<Reception> getCall();
}
