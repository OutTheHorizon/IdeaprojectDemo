package com.horizon.atdemotest;

import javax.annotation.processing.Filer;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;

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
            if (hasAnnotation) {
                AtDemoTestB annotation = (AtDemoTestB) constructor.getAnnotation(AtDemoTestB.class);
                System.out.println("constructor = " + constructor.getName()
                        + ";id=" + annotation.id() + ";description=" + annotation.name() + ";gid=" + annotation.gid());
            }
        }
    }

    public static void parseParam() {
        Field[] fi = UserAnnotationB.class.getDeclaredFields();
        System.out.println(fi[0].getName());
        for (Field param:
                fi) {
            boolean hasAnnotation = param.isAnnotationPresent(AtDemoTestB.class);
            if(hasAnnotation){
                AtDemoTestB annotation = param.getAnnotation(AtDemoTestB.class);
                System.out.println("method = "+ param.getName()
                        + ";id=" + annotation.id() + ";description=" + annotation.name() + ";gid=" + annotation.gid());
                System.out.println(param.getDeclaringClass());
                System.out.println(param.getType());
            }
        }
    }

    public static void parseTypeParam() {
        TypeVariable[] parameters = UserAnnotationB.class.getTypeParameters();
        System.out.println(parameters[0].getName());
        for (TypeVariable<Class<UserAnnotationB>> param:
                parameters) {
            boolean hasAnnotation = param.isAnnotationPresent(AtDemoTestB.class);
            if(hasAnnotation){
                AtDemoTestB annotation = param.getAnnotation(AtDemoTestB.class);
                System.out.println("method = "+ param.getName()
                        + ";id=" + annotation.id() + ";description=" + annotation.name() + ";gid=" + annotation.gid());
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException{
        parseTypeAnnotationB();
        parseMethodAnnotationB();
        parseConstructAnnotationB();
        System.out.println();
        parseParam();
    }
}
