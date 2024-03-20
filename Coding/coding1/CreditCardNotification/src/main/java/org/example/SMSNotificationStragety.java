package org.example;

public class SMSNotificationStragety implements NotificationStrategy {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending SMS notification to " + recipient + ": " + message);
    }
}
