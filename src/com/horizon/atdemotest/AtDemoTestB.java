package com.horizon.atdemotest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({TYPE,METHOD,FIELD,CONSTRUCTOR,PARAMETER,TYPE_PARAMETER})//将能够获得的类型，跟C语言的stdarg.h头文件很想。
@Retention(RetentionPolicy.RUNTIME)
public @interface AtDemoTestB {
    String name();
    int id() default 0;
    Class gid();
}