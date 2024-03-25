package org.example.observer;

public class Client {
    public static void main(String[] args) {
        // 1.创建公众号object
        SubscriptionSubject subject = new SubscriptionSubject();

        // 2.订阅公众号
        subject.attach(new WechatUser("Tian"));
        subject.attach(new WechatUser("Zan"));
        subject.attach(new WechatUser("Sweet"));

        // 3.公众号更新，发出发出消息给订阅者（观察者）
        subject.notify("hello, I love you");


    }
}
