package main.java.com.chuwa.learn.Publisher_Subscriber;

public class Client {

    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        subscriptionSubject.attach(new User("Tiffany"));
        subscriptionSubject.attach(new User("Chris"));
        subscriptionSubject.attach(new User("Hazel"));

        subscriptionSubject.notify("New article added!");

    }
}
