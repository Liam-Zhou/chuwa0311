package com.chuwa.learn.patterns.singleton.demo2;

/**
 * 单例类
 * 饿汉式：静态代码块
 */
public class Singleton {
    //1. 私有构造方法
    private Singleton() {}

    //2. 声明Singleton类型变量
    private static Singleton instance; //null

    //3. 在静态代码块中进行赋值
    static {
        instance = new Singleton();
    }

    //4. 对外提供获取类对象的方法
    public static Singleton getInstance() {
        return instance;
    }
}
