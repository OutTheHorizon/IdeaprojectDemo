package com.horizon.atdemotest;

public class GetDemo {
    public static void main(String []args) throws ClassNotFoundException {
        /**
         * 创建Retrofit实例
         */
        Retrofit retrofit = new Retrofit.Builder()
                .build();

        final GetRequest_Interface request = retrofit.create(GetRequest_Interface.class);
        //对 发送请求 进行封装
        Call<Reception> call = request.getCall();
        //异步请求
        call.enqueue(new CallBack<Reception>() {
            //请求成功时回调
            @Override
            public void onResponse(Call<Reception> call, Response<Reception> response) {
                //请求处理,输出结果
                Reception reception = response.body();
            }
        });
    }
}
