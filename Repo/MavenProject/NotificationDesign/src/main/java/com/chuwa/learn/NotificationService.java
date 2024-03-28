package com.chuwa.learn;

import java.util.HashMap;
import java.util.Map;
class NotificationService {
    private static Map<String, User> users;

    // constructor
    public NotificationService() {
        this.users = new HashMap<>();
    }

    // Register a user
    public static void registerUser(User user) {
        if (users == null) {
            users = new HashMap<>(); // Initialize the users map if it's null
        }
        users.put(user.getEmail(), user);
    }

    // send Notification
    public static void sendNotification(String email, String message) {
        User user = users.get(email);
        if (user == null) {
            throw new IllegalArgumentException("User with empty" + email + " not found");
        }
        Notification notification = NotificationFactory.getNotification(user.getNotificationPreference());
        notification.sendNotification(user, message);
    }

    public static void broadcastNotification(String message) {
        for (User user : users.values()) {
            sendNotification(user.getEmail(), message);
        }
    }
}
