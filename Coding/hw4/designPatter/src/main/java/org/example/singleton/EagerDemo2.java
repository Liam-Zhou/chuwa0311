package org.example.singleton;

/**
 * Eager Loading with Static Initializer Block
 */
public class EagerDemo2 {
    // 1. Private constructor
    private EagerDemo2 () {}
    // 声明singleton class的variable
    private static EagerDemo2 instance;

    // 在static 代码中进行赋值
    static {
        instance = new EagerDemo2();
    }
    // 对外提供获取该class的方法
    public static EagerDemo2 getInstance() {
        return instance;
    }
}
