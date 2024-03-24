package main.java.com.chuwa.learn.Singleton.demo3;

//Lazy Loading: loading when first time use
public class Singleton {

    private Singleton () {};

    public static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
