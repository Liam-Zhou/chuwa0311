public class Main {
    public static void main(String[] args) {
        // Create a user with preferred notification method as EMAIL
        User user_brian = new User("Brian", "Brian.Yu@google.com", "1234567890", "WhatsBrian", "EMAIL");

        // Notification content
        String message = "Hey " + user_brian.getFirstName() + ", you have successfully registered. Here is your reference number: XYZ123. Please use this for future references.";

        // Initialize the notification service and send the notification
        NotificationService service = new NotificationService();
        service.notifyUser(user_brian, message);

        String broadcastMessage = "40% off when you buy Popeyes between 06/13 - 06/19";
        for (User user : UserRepository.getAllUsers()) {
            service.notifyUser(user, "Hey " + user.getFirstName() + ", " + broadcastMessage);
        }
    }
}