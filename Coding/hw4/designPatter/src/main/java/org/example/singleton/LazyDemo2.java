package org.example.singleton;

/**
 * 双重检查lock
 * 在多线程的时候，可能会出现空指针的问题，出现问题的原因是JVM在instantiate object的时候
 * 会进行优化和指令重排序的操作
 * 要解决双检查的空指针异常，需要用volatile。it can make sure 可见性和有序性
 */
public class LazyDemo2 {
    private LazyDemo2(){}

    private static volatile LazyDemo2 instance;

    public static LazyDemo2 getInstance() {
        // Double-checked locking
        if (instance == null) { // Check if the instance is not initialized
            synchronized (LazyDemo2.class) { // Synchronize on the class object
                if (instance == null) { // Double check to ensure thread safety
                    instance = new LazyDemo2(); // Create a new instance
                }
            }
        }
        return instance;
    }
}
