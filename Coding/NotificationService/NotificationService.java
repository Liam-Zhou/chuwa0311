package NotificationService;

public class NotificationService {
    public static void sendNotification(String preference, String recipient, String message) {
        try {
            Notification notification = NotificationFactory.createNotification(preference);
            notification.sendNotification(recipient, message);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            // Handle error appropriately, e.g., notify admin, log error, etc.
        }
    }
}
