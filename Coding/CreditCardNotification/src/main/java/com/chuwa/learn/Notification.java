package com.chuwa.learn;

public interface Notification {
    void sendNotification(String name, String message) throws NotificationException;;
}
