package com.horizon.atdemotest;

public class Retrofit {
    private Retrofit mRetrofit;
    public <T> T create(final Class<T> service) {
        return (T) new GetRequest_Interface() {
            @Override
            public Call<Reception> getCall() {
                return null;
            }
        };
    }


    public static final class Builder {
        public Retrofit build(){
            return new Retrofit();
        }
    }
}
