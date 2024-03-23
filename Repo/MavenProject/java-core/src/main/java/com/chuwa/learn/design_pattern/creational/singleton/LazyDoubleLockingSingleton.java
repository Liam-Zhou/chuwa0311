package com.chuwa.learn.design_pattern.creational.singleton;

public class LazyDoubleLockingSingleton {
    private LazyDoubleLockingSingleton() {}

    private static volatile LazyDoubleLockingSingleton instance;

    public static LazyDoubleLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleLockingSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleLockingSingleton();
                }
            }
        }
        return instance;
    }
}