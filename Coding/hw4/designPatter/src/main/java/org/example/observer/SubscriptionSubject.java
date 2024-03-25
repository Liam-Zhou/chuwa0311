package org.example.observer;
import java.util.*;
// concrete subject

import java.util.ArrayList;

// concrete subject
public class SubscriptionSubject implements Subject {
    //定义一个集合，用于存储多个观察者对象
    private List<Observer> wechatUserList = new ArrayList<Observer>();
    @Override
    public void attach(Observer observer) {
        wechatUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        wechatUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : wechatUserList) {
            observer.update(message);
        }
    }
}
