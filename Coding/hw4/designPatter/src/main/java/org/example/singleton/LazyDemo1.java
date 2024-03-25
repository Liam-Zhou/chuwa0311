package org.example.singleton;

/**
 *
 */
public class LazyDemo1 {
    // 1. Private constructor
    private LazyDemo1(){}
    // 2. 声明singleton class的variable instance
    private static LazyDemo1 instance;

    //对外提供访问方式
    public static synchronized LazyDemo1 getInstance() {
        if (instance == null) {
            instance = new LazyDemo1();
        }
        return instance;
    }

}
