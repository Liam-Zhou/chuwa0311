package org.example;

import javax.management.Notification;

public class NotificationService {
    public void sendNotificationToUser(User user, String message) {
        NotificationStrategy strategy = null;
        switch (user.getPreference()) {
            case "EMAIL":
                strategy = new EmailNotificationStrategy();
                break;
            case "SMS" :
                strategy = new SMSNotificationStragety();
                break;
            case "WHATSAPP":
                strategy = new WhatsAppNotificationStrategy();
                break;
            default:
                System.out.println("Error: Invalid preference");
                return;
        }
        NotificationContext context = new NotificationContext(strategy);
        context.sendNotification(user.getEmail(), message);
    }

    public void broadcastPublicNotification(String message) {
        System.out.println("Broadcasting public notification: " + message);
    }

}
