package com.horizon.atdemotest;

import java.util.HashMap;
import java.util.Map;

//Use Class Annotation
@AtDemoTestA //使用了类注解
public class UserAnnotationA {
//    Use Class Var Annotation
    @AtDemoTestA //使用了类成员注解
    private Integer age;
//    Use Vector Annotation
    @AtDemoTestA //使用了构造方法注解
    public UserAnnotationA(){

    }
//   Annotation ...
    @AtDemoTestA //使用了类方法注解
    public void a(){
        @AtDemoTestA //使用了局部变量注解
        Map m = new HashMap(0);
    }

    @AtDemoTestA //使用了方法参数注解
    public void b(@AtDemoTestA Integer a){//使用了方法参数注解

    }

    public static void main(String[] args){
        System.out.println("Run Success");
    }
}
