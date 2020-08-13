package com.horizon.javabase.Demo5CallStyle;

/**
 * 小王
 */
public class Wang  implements Demo5CallBack{
    /**
     * 小李对象的引用
     * 相当于----->背景二
     */
    private final Li mLi;

    /**
     * 小王的构造方法，持有小李的引用
     * @param li 小李
     */
    public Wang(Li li){
        this.mLi = li;
    }

    /**
     * 小王通过这个方法去问小李的问题
     * @param question 就是小王要问的问题,1+1=?
     */
    public void askQuestion(final String question){
        //这里用一个线程就是一个异步
        new Thread(new Runnable() {
            @Override
            public void run() {
                /**
                 * 小王调用小李中的方法，在这里注册回调接口
                 * 这就相当于A类调用B的方法C
                 */
                mLi.executeMessage(Wang.this, question);
            }
        }).start();

        delay(10000);
        //小王问完问题挂掉电话就去干其他的事情了，逛街去了
        play();
    }

    public void play(){
        System.out.println("我要逛街去了");
    }


    /**
     * 调用了接口，小李知道答案后调用此方法告诉小王，就是所谓的小王的回调方法
     * @param result 是答案
     */
    @Override
    public void solve(String result) {
        System.out.println("小李告诉小王的答案是--->"+result);
    }

    public static void delay(long mm){
        for (int i = 0; i < mm*10000; i++) {
            ;
        }
    }
}
