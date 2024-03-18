package com.chuwa.learn;

public class WhatsAppNotification implements NotificationStrategy {
    public void send(String userWhatsApp, String message) {
        try {
            System.out.println("Sending WhatsApp message to " + userWhatsApp + ": " + message);
            // Here would be the real email sending logic which could throw exceptions
        } catch (Exception e) {
            throw new NotificationException("Failed to send WhatsApp message", e);
        }
    }
}
