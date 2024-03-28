package org.example.observer;

public interface Subject {
    // add observer
    void attach(Observer observer);

    // delete observer
    void detach(Observer observer);

    // 通知订阅者更新消息
    void notify(String message);

}
