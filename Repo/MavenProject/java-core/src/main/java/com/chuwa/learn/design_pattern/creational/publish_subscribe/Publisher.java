package com.chuwa.learn.design_pattern.creational.publish_subscribe;

public interface Publisher {
    void attach(Subscriber subscriber);

    void detach(Subscriber subscriber);

    void notify(String message);
}