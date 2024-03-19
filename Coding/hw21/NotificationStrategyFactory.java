public class NotificationStrategyFactory {
    private static NotificationStrategyFactory notificationStrategyFactory = new NotificationStrategyFactory();
    private NotificationStrategyFactory() {

    }
    public static NotificationStrategyFactory getNotificationStrategyFactory() {
        return notificationStrategyFactory;
    }

    public static NotificationStrategy getNotificationStrategy(User user) throws NotificationException {
        switch (user.getNotificationPreference()) {
            case EMAIL:
                return new EmailNotificationStrategy();
            case SMS:
                return new SMSNotificationStrategy();
            case WHATSAPP:
                return new WhatsAppNotificationStrategy();
            default:
                throw new NotificationException("Invalid Preference");
        }
    }
}
