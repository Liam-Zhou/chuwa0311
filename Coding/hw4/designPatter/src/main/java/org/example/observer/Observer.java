package org.example.observer;

public interface Observer {
    // 主题推送的内容
    void update(String message);
}
