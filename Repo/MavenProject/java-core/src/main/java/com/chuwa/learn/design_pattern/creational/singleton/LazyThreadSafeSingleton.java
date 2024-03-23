package com.chuwa.learn.design_pattern.creational.singleton;

public class LazyThreadSafeSingleton {
    private LazyThreadSafeSingleton() {}

    private static LazyThreadSafeSingleton instance;

    public static synchronized LazyThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyThreadSafeSingleton();
        }
        return instance;
    }
}