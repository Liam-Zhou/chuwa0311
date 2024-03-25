package com.chuwa.learn.patterns.singleton.demo1;

/**
 * 访问类
 */
public class Client {
    public static void main(String[] args) {
        //创建Singleton对象
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        //判断获取到的是否为同一个对象
        System.out.println(instance1 == instance);
    }
}
