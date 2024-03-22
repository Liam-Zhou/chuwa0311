package org.example.singleton;

public class LazyLoadSingleton {
    // Private constructor to prevent instantiation from outside the class
    private LazyLoadSingleton() {

    }

    static {
        ///do something
    }

    // Static inner class to hold the Singleton instance
    private static class SingletonHolder {
        private static final LazyLoadSingleton INSTANCE = new LazyLoadSingleton();
    }

    // Public static method to get the Singleton instance
    public static LazyLoadSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
