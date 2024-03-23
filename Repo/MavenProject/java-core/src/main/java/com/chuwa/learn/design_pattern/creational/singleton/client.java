package com.chuwa.learn.design_pattern.creational.singleton;

public class client {
    public static void main(String[] args) {
        EagerEnum instance1 = EagerEnum.INSTANCE;
        EagerEnum instance2 = EagerEnum.INSTANCE;

        System.out.println(instance1 == instance2);
    }
}
