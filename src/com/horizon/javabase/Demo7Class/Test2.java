package com.horizon.javabase.Demo7Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射来生成对象
 * 1 使用Class对象但newInstance()方法来创建该Class对象对应类但实例。
 * 但是这种方式要求该Class对象但对应类有默认但构造器，而执行newInstance()方法时实际上是利用默认构造器来创建该类但实例。
 * 2 先试用Class对象获取指定但Constructor对象，再调用Constructor对象的newInstance()方法来创建该Class对象对用类的实例。
 * （可以获得该Class对象，利用该Class对象的getConstructor方法来获取指定的构造器，调用Constructor的newInstance方法来创建Java对象。）
 */
public class Test2 {
    /**
     * Java 的反射机制是指：反射就是把Java类中的各种成分映射成相应的Java类，然后就可以获取这个类的所有信息
     * @throws Exception
     */
    public static void createObj1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //返回与带有给定字符串名的类或接口相关联的Class对象
        //Class classType = Ps2.class;
        Class classType = Class.forName("com.horizon.javabase.Demo7Class.Ps2");
        Object obj = classType.newInstance();
        System.out.println("使用反射放射机制创建出来的对象是否是Person类的对象：" +
                (obj instanceof Ps2));
    }
    /**
     *
     */
    public static void createObj2() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class classType = Ps2.class;
        Constructor<Ps2> con = classType.getConstructor(String.class, int.class);
        Object obj = con.newInstance("lxf", "23");
        System.out.println("使用constructor对象的newInstance方法创建对象的信息：" +
                ((Ps2)obj).getName());
    }

    public static void methodDo() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Ps2 p = new Ps2();
        Class classType = Ps2.class;
        Method method = classType.getMethod("setName", String.class);
        method.invoke(p, "ckl");
        System.out.println("使用反射操作setName方法后，Ps2对象的name值是：" +
                p.getName());
        Method method1 = classType.getDeclaredMethod("test");
        method1.setAccessible(true);
        method1.invoke(p);
    }

    public static void FiledDo() throws NoSuchFieldException, IllegalAccessException {
        Ps2 p = new Ps2();
        Class classType = Ps2.class;
        Field field = classType.getDeclaredField("name");
        Field field1 = classType.getDeclaredField("age");
        field.setAccessible(true);
        field1.setAccessible(true);
        field.set(p, "lxf");
        field1.set(p,23);
        System.out.println("使用反射机制操作被private修饰的对象字段后得到的属性值是：" +
                p.getName());
        System.out.println("使用反射机制操作被private修饰的对象字段后得到的属性值是：" +
                p.getAge());
    }
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        new Test2().FiledDo();
    }
}
