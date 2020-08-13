package com.horizon.javabase.Demo7Class;

import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 反射技术：动态的获取类以及类中的成员，并可调用该类的成员
         * 以前有什么类就new什么对象
         * 现在没有类，给什么类就new什么对象
         *
         * 反射技术的出现提高了程序的扩展性
         * 反射技术中最重要的一点：先获取到那个类
         * 如何获取类呢？
         *
         * 无论new什么对象，都需要先获取字节码文件
         * 如何获取呢？发现java已对字节码文件进行了描述用Class类完成的
         *
         * 如何获取一个字节码文件的对象呢？
         *
         * 方式一：Object getClass()方法，发现在反射技术里，该方法不合适，反射技术中不明确具体类
         *
         * 方式二：所有的数据类型都由自己对应的class对象，表示方式很简单
         * 每一个数据类型都由一个默认的静态属性。.class用该属性就可以获取到字节码文件对象
         * 虽然不用对象调用，但还是要用具体但类调用静态属性
         *
         * 方法三：在Class类汇总找到类forName方法，通过名称就可以获取对应但字节码文件对象
         * 重点！！！！！
         *
         */
        //methodDemo();
        //methodDemo_2();
        methodDemo_3();
    }

    public static void methodDemo_3() throws ClassNotFoundException {
        String className = "com.horizon.javabase.Demo7Class.Ps";
        Class clazz = Class.forName(className);
        System.out.println(clazz.getName());
        Method[] method = clazz.getMethods();
        for (int i = 0; i < method.length; i++) {
            System.out.println(method[i].getName());
        }
        System.out.println(clazz);
    }

    public static void methodDemo_2(){
        Class clazz = Ps.class;
        Class clazz2 = Ps.class;
        System.out.println(clazz == clazz2);
    }

    public static void methodDemo(){
        Ps p1 = new Ps();
        Class c1 = p1.getClass();

        Ps p2 = new Ps();
        Class c2 = p2.getClass();

        System.out.println(c1 == c2);
    }
}
