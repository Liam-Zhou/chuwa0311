package org.example.publisher_subscriber;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject {
    List<Observer> wechatList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        wechatList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        wechatList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : wechatList) {
            observer.update();
        }
    }
}
