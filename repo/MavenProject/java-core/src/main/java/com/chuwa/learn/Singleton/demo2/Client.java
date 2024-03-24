package main.java.com.chuwa.learn.Singleton.demo2;

//Eager Loading
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        //true
        System.out.println(instance == Singleton.getInstance());
    }
}
