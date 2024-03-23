package com.chuwa.learn.design_pattern.creational.singleton;

public class EagerStaticVariableSingleton {
    // 1. private constructor
    private EagerStaticVariableSingleton() {}

    // 2. Create object in current class
    private static EagerStaticVariableSingleton instance = new EagerStaticVariableSingleton();

    // 3.Provide a public getter
    public static EagerStaticVariableSingleton getInstance() {
        return instance;
    }
}