public class NotificationFactory {
    public NotificationPreference getNotificationFactory(String preference){
        switch (preference){
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            case "WHATSAPP":
                return new WhatsAPPNotification();
            default:
                throw new IllegalArgumentException("Invalid Notification Preference: " + preference);
        }
    }
}
