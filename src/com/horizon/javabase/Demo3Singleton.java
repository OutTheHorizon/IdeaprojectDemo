package com.horizon.javabase;

public class Demo3Singleton {
    private Demo3Singleton(){}
    //定义一个私有构造方法
    private static volatile Demo3Singleton instance;
    //volatile 确定多线程可访问

    /**
     * 单例模式最优方案
     * @return
     */
    public static Demo3Singleton getInstance(){
        if(instance == null){
            //同步代码块
            synchronized (Demo3Singleton.class){
                //未初始化，则初始instance变量
                if(instance == null){
                    instance = new Demo3Singleton();
                }
            }
        }
        return instance;
    }


}
