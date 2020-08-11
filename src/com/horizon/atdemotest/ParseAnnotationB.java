package com.horizon.atdemotest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ParseAnnotationB {
    public static void parseTypeAnnotationB() throws ClassNotFoundException {
        Class clazz = Class.forName("com.horizon.atdemotest.UserAnnotationB");
        Annotation[] mAnnotations = clazz.getAnnotations();
        for (Annotation annotation:mAnnotations) {
            AtDemoTestB testB = (AtDemoTestB)annotation;
            System.out.println("id="+testB.id()+";name="+testB.name()+";gid="+testB.gid());
        }
    }

    public  static void parseMethodAnnotationB(){
        Method[] methods = UserAnnotationB.class.getDeclaredMethods();
        for (Method method: methods) {
            boolean hasAnnotation = method.isAnnotationPresent(AtDemoTestB.class);
            if(hasAnnotation) {
                AtDemoTestB annotation = method.getAnnotation(AtDemoTestB.class);
                System.out.println("method = "+ method.getName()
                        + ";id=" + annotation.id() + ";description=" + annotation.name() + ";gid=" + annotation.gid());
            }
        }
    }
    public  static void parseConstructAnnotationB(){
        Constructor[] constructors = UserAnnotationB.class.getConstructors();
        for (Constructor constructor: constructors) {
            boolean hasAnnotation = constructor.isAnnotationPresent(AtDemoTestB.class);
            if(hasAnnotation) {
                AtDemoTestB annotation = (AtDemoTestB) constructor.getAnnotation(AtDemoTestB.class);
                System.out.println("constructor = "+ constructor.getName()
                        + ";id=" + annotation.id() + ";description=" + annotation.name() + ";gid=" + annotation.gid());
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException{
        parseTypeAnnotationB();
        parseMethodAnnotationB();
        parseConstructAnnotationB();
    }
}
