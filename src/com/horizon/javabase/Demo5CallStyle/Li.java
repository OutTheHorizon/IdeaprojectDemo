package com.horizon.javabase.Demo5CallStyle;

public class Li {
    /**
     * 相当于B类有参数为CallBck callBack的f() --->背景三
     * ---我觉得像是一个小李的个人安排计划表，别人可以告诉我要做什么，但是我必须先把手头的做完。
     * ---当我把别人的任务做完了，我就会喊他，用什么喊？用接口喊：我把结果给你。
     * ---这个接口是谁不重要，主要是要我能把结果还给他。
     * @param callBack
     * @param question 小王问的问题
     */
    public void executeMessage(Demo5CallBack callBack,String question){
        System.out.println("小王问的问题---->"+question);
        //模拟小李办自己的事情需要很长时间
        for(int i=0; i<1000000; i++){

        }
        /**
         * 小李办完自己的事情之后想到了答案是2
         */
        String result = "答案是2";
        /**
         * 于是就打电话告诉小王，调用小王中的方法
         * 这就相当于B类反过来调用A的方法D
         */
        callBack.solve(result);
    }
}
