package org.example.singleton;

/**
 * eager loading with static variable
 * are initialized before their usage.
 */
public class EagerDemo1 {
    // 1. Private constructor
    private  EagerDemo1() {}
    // 2. 在本class中创建本class的object
    private static EagerDemo1 instance = new EagerDemo1();

    // 3.提供一个公共的访问方式，让外界访问该object
    // 外界不能创建这个object，就不能调用非static的method，所以这个方法需要是static
    public static EagerDemo1 getInstance() {
        return instance;
    }

}
