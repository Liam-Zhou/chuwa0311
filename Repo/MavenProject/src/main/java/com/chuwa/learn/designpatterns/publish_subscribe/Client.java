package com.chuwa.learn.designpatterns.publish_subscribe;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();
        subject.attach(new WeiXinUser("Sun Wu Kong"));
        subject.attach(new WeiXinUser("Zhu Wu Neng"));
        subject.attach(new WeiXinUser("Sha Wu Jing"));

        subject.notify("Updated!");
    }
}
