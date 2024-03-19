package com.chuwa.learn;

public class Main {
    public static void main(String[] args) throws NotificationException {
        NotificationService notificationService = new NotificationService();
        notificationService.addUserPreference("A", "EMAIL");
        notificationService.addUserPreference("B", "SMS");
        notificationService.addUserPreference("C", "WHATSAPP");

        // Send individual notifications
        notificationService.notifyUser("A", "Alice", "Hey Alice, you have successfully registered to add and here is your , please use this for future references.");

        // Broadcast public notification
        notificationService.broadcastNotification("40% off when you buy Popeyes between 06/13 - 06/19");
    }
}