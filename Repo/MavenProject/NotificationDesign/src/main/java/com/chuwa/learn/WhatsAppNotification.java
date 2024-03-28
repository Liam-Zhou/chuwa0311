package com.chuwa.learn;

public class WhatsAppNotification implements Notification{
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending WhatsApp notification to " + user.getWhatsAppNumber() + ": " + message);
    }
}
