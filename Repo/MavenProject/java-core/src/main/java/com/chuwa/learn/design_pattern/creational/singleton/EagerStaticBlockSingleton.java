package com.chuwa.learn.design_pattern.creational.singleton;

public class EagerStaticBlockSingleton {
    private EagerStaticBlockSingleton() {
    }

    private static EagerStaticBlockSingleton instance;

    static {
        instance = new EagerStaticBlockSingleton();
    }

    public static EagerStaticBlockSingleton getInstance() {
        return instance;
    }
}