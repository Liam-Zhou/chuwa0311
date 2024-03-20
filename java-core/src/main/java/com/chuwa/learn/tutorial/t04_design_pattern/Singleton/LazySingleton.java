package com.chuwa.learn.tutorial.t04_design_pattern.Singleton;

public class LazySingleton {
    private static LazySingleton INSTANCE_LAZY;
    private LazySingleton(){}
    public LazySingleton getInstance(){
        if(INSTANCE_LAZY == null){
            INSTANCE_LAZY = new LazySingleton();
        }
        return INSTANCE_LAZY;
    }

}
