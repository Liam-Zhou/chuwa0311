package com.chuwa.learn;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<User> users = new ArrayList<User>();

    public void addUser(User user) {
        users.add(user);
    }

    public void sendPublicNotification(String message) {
        for (User user : users) {
            try {
                user.notifyUser(message);
            } catch (Exception e) {
                System.out.println("Error sending notification: " + e.getMessage());
            }
        }
    }
}
