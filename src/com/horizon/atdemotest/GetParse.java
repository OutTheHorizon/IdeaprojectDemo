package com.horizon.atdemotest;

import java.awt.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class GetParse {
    public static void getUrl() throws ClassNotFoundException {
        Method[] methods = UserAnnotationB.class.getDeclaredMethods();
        for (Method method: methods) {
            boolean hasAnnotation = method.isAnnotationPresent(Get.class);
            if(hasAnnotation) {
                Get annotation = method.getAnnotation(Get.class);
                System.out.println("use the tools :"+ method.getName());
            }
        }
    }

}
