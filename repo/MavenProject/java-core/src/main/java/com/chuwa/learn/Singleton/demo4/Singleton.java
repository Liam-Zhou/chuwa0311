package main.java.com.chuwa.learn.Singleton.demo4;

//Lazy Loading and thread safe
public class Singleton {
    private Singleton () {};

    public static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
