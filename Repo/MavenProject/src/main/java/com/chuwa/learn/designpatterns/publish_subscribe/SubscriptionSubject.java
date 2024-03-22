package com.chuwa.learn.designpatterns.publish_subscribe;

import java.util.*;
public class SubscriptionSubject implements Subject {

    private List<Observer> weiXinUserList = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
    weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weiXinUserList) {
            observer.update(message);
        }
    }
}
