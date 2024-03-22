package com.chuwa.learn.ood_pattern.singleton;

/**
 * Eager singleton, use static field
 */
public class Singleton_EagerStaticField {
    private static Singleton_EagerStaticField instance = new Singleton_EagerStaticField();
    private Singleton_EagerStaticField(){}

    public static Singleton_EagerStaticField getInstance(){return instance;}

    public static void main(String[] args) {
        Singleton_EagerStaticField instance = Singleton_EagerStaticField.getInstance();
        Singleton_EagerStaticField instance2 = Singleton_EagerStaticField.getInstance();
        System.out.println(instance2 == instance);
    }
}
