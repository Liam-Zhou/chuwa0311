package main.java.com.chuwa.learn.Publisher_Subscriber;

public class User implements Observer{
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("name: " + name + " message: " + message);
    }
}
