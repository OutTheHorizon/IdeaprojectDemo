package com.horizon.atdemotest;

import jdk.jfr.DataAmount;

import java.util.HashMap;
import java.util.Map;

//Use Class Annotation
@AtDemoTestB(name="type", gid=Long.class) //类成员注解
public class UserAnnotationB {
    //    Use Class Var Annotation
    @AtDemoTestB(name="param",id = 1, gid = Long.class) //使用了类成员注解
    private Integer age;
    //    Use Vector Annotation
    @AtDemoTestB(name="construct",id = 2, gid = Long.class) //使用了构造方法注解
    public UserAnnotationB(){

    }
    //   Annotation ...
    @AtDemoTestB(name="public method",id = 3, gid = Long.class) //使用了类方法注解
    public void a(){
                Map m = new HashMap(0);
    }

    @AtDemoTestB(name = "protected method",id=4, gid = Long.class)
    protected void b(){
        Map m = new HashMap(0);
    }
    @AtDemoTestB(name = "private method",id=5, gid = Long.class)
    private void c(){
        Map m = new HashMap(0);
    }
    public void b(Integer a){}
}
