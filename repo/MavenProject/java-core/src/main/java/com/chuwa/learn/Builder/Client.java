package main.java.com.chuwa.learn.Builder;

public class Client {
    public static void main(String[] args) {

        Director director = new Director(new MobileBuilder());
        Bike bike = director.build();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
