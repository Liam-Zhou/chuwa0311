package org.example.singleton;

/**
 * Eager Loading: class loading 的时候就会创建instance object
 * 因为class loading 而创建，可能会存在内存浪费的问题
 *
 * Lazy Loading： class loading 时候不会创建instance object，而是首次使用该object才会被创建
 *
 **/
public class Client {
    public static void main(String[] args) {
        EagerDemo1 instance1 = EagerDemo1.getInstance();
        EagerDemo1 instance2 = EagerDemo1.getInstance();

        System.out.println(instance2 == instance1);

    }
}
