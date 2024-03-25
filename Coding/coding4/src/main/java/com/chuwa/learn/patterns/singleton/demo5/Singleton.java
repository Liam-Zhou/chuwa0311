package com.chuwa.learn.patterns.singleton.demo5;

/**
 * 懒汉式：静态内部类
 * JVM在加载外部类时，不会加载静态内部类，只有内部类的属性/方法被调用时才会加载
 */
public class Singleton {
    private Singleton() {}

    private static class SingletonHolder {
        //静态属性由于被static修饰，所以保证只被实例化一次
        //并且严格遵守实例化顺序
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
