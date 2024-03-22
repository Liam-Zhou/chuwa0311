package org.example.singleton;

public class EagerLoadSingleton {
    // 1, private static variable
    private static EagerLoadSingleton instance = new EagerLoadSingleton();

    // 2, make constructor be private
    // 保证不能new， 一旦可以new, 就可以建造很多instance， 则就不再是singleton。
    private EagerLoadSingleton() {

    }

    // 3. static getInstance method
    // static保证在没有instance的情况下，可以调该方法。
    public static EagerLoadSingleton getInstance() {
        return instance;
    }

}
