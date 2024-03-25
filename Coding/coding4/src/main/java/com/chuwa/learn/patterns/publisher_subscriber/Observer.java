package com.chuwa.learn.patterns.publisher_subscriber;

/**
 * 抽象观察者类
 */
public interface Observer {
    void update(String message);
}
