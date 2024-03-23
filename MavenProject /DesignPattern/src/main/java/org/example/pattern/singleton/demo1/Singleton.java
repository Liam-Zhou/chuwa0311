package org.example.pattern.singleton.demo1;

// eager
// static
public class Singleton {
    private Singleton(){}

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}
