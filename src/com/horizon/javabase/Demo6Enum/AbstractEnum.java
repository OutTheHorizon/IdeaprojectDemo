package com.horizon.javabase.Demo6Enum;

/**
 * 枚举实现接口
 * 枚举接口的所有实例都需要放在第一行，不需要new，不需要显示调用构造器。自动添加 public static final修饰。
 * 使用enum定义，非抽象的枚举类默认使用final修饰，不可被继承。
 */
public enum AbstractEnum {
    PLUS{
        @Override
        public double eval(double x, double y){
            return x+y;
        }
    },
    MINUS{
        @Override
        public double eval(double x, double y){
            return x-y;
        }
    },
    TIMES{
        @Override
        public double eval(double x, double y){
            return x*y;
        }
    },
    DIVIDE{
        @Override
        public double eval(double x, double y){
            return x/y;
        }
    };

    public abstract double eval(double x, double y);
    public static void main(String[] args){
        System.out.println(AbstractEnum.PLUS.eval(10,2));
        System.out.println(AbstractEnum.MINUS.eval(10,2));
        System.out.println(AbstractEnum.TIMES.eval(10,2));
        System.out.println(AbstractEnum.DIVIDE.eval(10,2));
    }
}
