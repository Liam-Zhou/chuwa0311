package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a notification service
        NotificationService notificationService = new NotificationService();

        // Create user objects with different notification preferences
        User user1 = new User("Alice", "Smith", "alice@example.com", "1234567890", "EMAIL");
        User user2 = new User("Bob", "Johnson", "bob@example.com", "9876543210", "SMS");
        User user3 = new User("Charlie", "Brown", "charlie@example.com", "5678901234", "WHATSAPP");

        // Send notifications to users
        notificationService.sendNotificationToUser(user1, "Hey " + user1.getFirstName() + ", you have successfully registered to add and here is your , please use this for future references.");
        notificationService.sendNotificationToUser(user2, "Hey " + user2.getFirstName() + ", you have successfully registered to add and here is your , please use this for future references.");
        notificationService.sendNotificationToUser(user3, "Hey " + user3.getFirstName() + ", you have successfully registered to add and here is your , please use this for future references.");

        // Broadcast public notification
        notificationService.broadcastPublicNotification("40% off when you buy Popeyes between 06/13 - 06/19");
    }
}