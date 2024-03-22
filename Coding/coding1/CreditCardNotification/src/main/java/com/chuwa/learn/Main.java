package com.chuwa.learn;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alice", "alice@example.com", new EmailNotification());
        User user2 = new User("Bob", "bob@example.com", new SmsNotification());
        User user3 = new User("Charlie", "charlie@example.com", new WhatsAppNotification());

        NotificationService notificationService = new NotificationService();
        notificationService.addUser(user1);
        notificationService.addUser(user2);
        notificationService.addUser(user3);

        notificationService.sendPublicNotification("Hey firstName, you have successfully registered, and here is your promo code: XYZ123, please use this for future references.");
        notificationService.sendPublicNotification("40% off when you buy Popeyes between 06/13 - 06/19.");
    }
}
