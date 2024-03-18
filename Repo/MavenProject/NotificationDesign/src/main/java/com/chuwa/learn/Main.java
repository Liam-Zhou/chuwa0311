package com.chuwa.learn;

public class Main {
    public static void main(String[] args) {
        User user1 = new User ("Jack", "zz12@gmail.com", "+1234567890", "+1234567890", "EMAIL");
        User user2 = new User("Alice", "alice@example.com", "+9876543210", "+9876543210", "SMS");
        User user3 = new User("John", "john@example.com", "+3876543210", "+3876543210", "WHATSAPP");
        NotificationService.registerUser(user1);
        NotificationService.registerUser(user2);
        NotificationService.registerUser(user3);
        try {
            NotificationService.sendNotification("alice@example.com", "Hey " + user2.getName() + ", you have successfully registered to add and here is your, please use this for future references.");
            System.out.println(" ");
            NotificationService.broadcastNotification("40% off when you buy Popeyes between 06/13 - 06/19");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}