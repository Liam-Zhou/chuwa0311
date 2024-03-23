package com.chuwa.learn.design_pattern.creational.publish_subscribe;

import java.util.*;
public class SubscriptionPublisher implements Publisher {

    private List<Subscriber> weiXinUserList = new ArrayList<>();
    @Override
    public void attach(Subscriber subscriber) {
        weiXinUserList.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        weiXinUserList.remove(subscriber);
    }

    @Override
    public void notify(String message) {
        for (Subscriber subscriber : weiXinUserList) {
            subscriber.update(message);
        }
    }
}