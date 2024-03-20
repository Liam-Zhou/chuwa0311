package org.example;

public class WhatsAppNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending WhatsApp notification to " + recipient + ": " + message);
    }
}
