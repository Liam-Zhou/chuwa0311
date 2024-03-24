package main.java.com.chuwa.learn.Publisher_Subscriber;

import java.util.*;

public class SubscriptionSubject implements Subject{
    private List<Observer> weixinUserList = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer: weixinUserList) {
            observer.update(message);
        }
    }
}
