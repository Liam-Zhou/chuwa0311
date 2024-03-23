package com.chuwa.learn.design_pattern.creational.singleton;

public class LazyNonThreadSafeSingleton {
    private LazyNonThreadSafeSingleton() {}

    private static LazyNonThreadSafeSingleton instance;

    public static LazyNonThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyNonThreadSafeSingleton();
        }
        return instance;
    }

}