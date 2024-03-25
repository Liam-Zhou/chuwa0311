package com.chuwa.learn.patterns.publisher_subscriber;

public class Client {
    public static void main(String[] args) {
        //创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();

        //订阅公众号
        subject.attach(new WeiXinUser("user1"));
        subject.attach(new WeiXinUser("user2"));
        subject.attach(new WeiXinUser("user3"));

        //公众号更新，发出消息给订阅者（观察者对象）
        subject.notify("New message");
    }
}
