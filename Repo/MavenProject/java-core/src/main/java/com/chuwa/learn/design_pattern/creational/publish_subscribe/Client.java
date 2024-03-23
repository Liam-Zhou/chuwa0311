package com.chuwa.learn.design_pattern.creational.publish_subscribe;

public class Client {
    public static void main(String[] args) {
        SubscriptionPublisher subject = new SubscriptionPublisher();
        subject.attach(new WeiXinUser("Sun Wu Kong"));
        subject.attach(new WeiXinUser("Zhu Wu Neng"));
        subject.attach(new WeiXinUser("Sha Wu Jing"));

        subject.notify("Updated!");
    }
}