package org.example.publisher_subscriber;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        subscriptionSubject.attach(new WechatUser("User 1"));
        subscriptionSubject.attach(new WechatUser("User 2"));
        subscriptionSubject.attach(new WechatUser("User 3"));
        subscriptionSubject.attach(new WechatUser("User 4"));

        WechatUser wechatUser5 = new WechatUser("User 5");
        subscriptionSubject.attach(wechatUser5);
        subscriptionSubject.detach(wechatUser5);

        subscriptionSubject.notify("New Article Released!");
    }
}
