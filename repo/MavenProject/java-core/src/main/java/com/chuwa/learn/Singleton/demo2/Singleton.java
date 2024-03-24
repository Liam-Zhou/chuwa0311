package main.java.com.chuwa.learn.Singleton.demo2;

//Lazy Loading
public class Singleton {
    private Singleton() {};

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
