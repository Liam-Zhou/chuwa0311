package com.chuwa.learn.tutorial.t04_design_pattern.Singleton;

public class EagerSingleton {
    private static final EagerSingleton INSTANCE_EAGER = new EagerSingleton();
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){return INSTANCE_EAGER;}
}
