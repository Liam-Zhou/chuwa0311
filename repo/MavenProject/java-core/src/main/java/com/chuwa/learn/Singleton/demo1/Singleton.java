package main.java.com.chuwa.learn.Singleton.demo1;

//Eager Loading
public class Singleton {
    private Singleton() {};

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
