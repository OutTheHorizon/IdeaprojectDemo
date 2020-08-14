package com.horizon.javabase.Demo5CallStyle;

import java.util.Random;

/**
 *
 */
public class Staff {

    long randomNum = System.currentTimeMillis();
    int random = (int) (randomNum%20);
    public void staffDoSelfThing(){
        //自己的事
        System.out.println("员工正在处理之前未完成的很多文件...");
        for (int i = 0; i < random; i++) {
            delay(10000);
        }
        System.out.println("员工处理完文件了");
    }

    public void BossSendJob(Job who_job, String job_content){
        //假设在做任务
        System.out.println("员工已收到老板分发的任务:"+job_content+"但是暂时没时间做");
        staffDoSelfThing();
        System.out.println("员工已做完自己的事了");
        System.out.println("员工已做完Boss的事了");
        //做完任务告诉老板
        who_job.onComplete("喂，老板完成啦！");
    }
    public static void delay(long mm){
        for (int i = 0; i < mm*10000; i++) { ; }
    }
}
