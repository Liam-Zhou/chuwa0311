package org.example;

public class EmailNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending email notification to " + recipient + ":  "+ message);
    }
}
