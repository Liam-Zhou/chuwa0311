package main.java.com.chuwa.learn.Singleton.demo5;

public class Singleton {
    private Singleton () {};

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
