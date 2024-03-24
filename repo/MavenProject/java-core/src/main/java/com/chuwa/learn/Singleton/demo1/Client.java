package main.java.com.chuwa.learn.Singleton.demo1;

public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        //true
        System.out.println(instance == Singleton.getInstance());
    }
}
