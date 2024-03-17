public class NotificationStrategyFactory {
    public static INotificationStrategy getStrategy(String preference) throws Exception {
        return switch (preference) {
            case "EMAIL" -> new EmailNotificationStrategy();
            case "SMS" -> new SMSNotificationStrategy();
            case "WhatsApp" -> new WhatsAppNotificationStrategy();
            default -> throw new Exception("Unsupported notification preference: " + preference);
        };
    }
}
