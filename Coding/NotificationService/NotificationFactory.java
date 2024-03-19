package NotificationService;

public class NotificationFactory {
    public static Notification createNotification(String preference) {
        switch (preference.toUpperCase()) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            case "WHATSAPP":
                return new WhatsAppNotification();
            default:
                throw new IllegalArgumentException("Invalid notification preference: " + preference);
        }
    }
}
