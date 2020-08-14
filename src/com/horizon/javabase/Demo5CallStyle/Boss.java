package com.horizon.javabase.Demo5CallStyle;

public class Boss implements Job{
    static boolean isComplete = false;
    static int hour = 8;
    private void BossDoSelfThing(){
        System.out.println("老板正在自己数钱......");
        delay(10000);
        System.out.println("老板数完钱了");
    }

    private void BossTakeJobTo(Staff staff, String staff_job){
        //叫员工做事，但是老板不会看着他
        new Thread(new Runnable() {
            @Override
            public void run() {
                staff.BossSendJob(Boss.this, staff_job);
            }
        }).start();
    }

    @Override
    public void onComplete(String s) {
        System.out.println("员工已完成" +
                "并且员工发了个信号："+s);
        isComplete=true;
    }

    //这里的主函数相当于公司里Boss的一天
    public static void main(String[] args){
        Boss boss_hz = new Boss();
        Staff staff_robot = new Staff();
        System.out.println("早上8点，老板分配任务给员工了");
        boss_hz.BossTakeJobTo(staff_robot, "今天干个通宵。。。");
        while (true) {
            boss_hz.BossDoSelfThing();
            if (isComplete) {System.out.println("GOOD JOB!!!"); break;}
            hour+=1;
            if(hour==24) {
                System.out.println("今天过去了" +
                        "，可惜员工还是没有完成任务");
                break;
            }
        }
    }
    public static void delay(long mm){
        for (int i = 0; i < mm*10000; i++) { ; }
    }
}
