package com.chuwa.learn;

public class SmsNotification implements NotificationStrategy{
    public void send(String userPhone, String message) {
        try {
            System.out.println("Sending SMS to " + userPhone + ": " + message);
            // Here would be the real email sending logic which could throw exceptions
        } catch (Exception e) {
            throw new NotificationException("Failed to send SMS", e);
        }
    }
}
