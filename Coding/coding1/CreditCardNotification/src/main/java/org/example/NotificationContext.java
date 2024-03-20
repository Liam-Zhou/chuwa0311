package org.example;

public class NotificationContext {
    private NotificationStrategy notificationStrategy;

    public NotificationContext(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void sendNotification(String recipant, String message) {
        notificationStrategy.sendNotification(recipant, message);
    }


}
