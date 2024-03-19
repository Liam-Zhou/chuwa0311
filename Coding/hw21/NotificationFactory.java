public class NotificationFactory {
    public static NotificationStrategy getNotificationStrategy(String preference) throws NotificationException {
        switch (preference.toLowerCase()) {
            case "email":
                return new EmailNotificationStrategy();
            case "sms":
                return new SMSNotificationStrategy();
            case "whatsapp":
                return new WhatsAppNotificationStrategy();
            default:
                throw new NotificationException("Invalid notification preference: " + preference);
        }
    }
}
