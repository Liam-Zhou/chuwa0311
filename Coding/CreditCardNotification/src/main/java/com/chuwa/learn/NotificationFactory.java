package com.chuwa.learn;

public class NotificationFactory {
    public static Notification createNotification(String pref) throws NotificationException {
        switch (pref.toUpperCase()) {
            case "EMAIL":
                return new Email();
            case "SMS":
                return new SMS();
            case "WHATSAPP":
                return new WhatsApp();
            default:
                throw new NotificationException("Invalid notification preference: " + pref);
        }
    }
}
