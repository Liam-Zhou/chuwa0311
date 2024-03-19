class NotificationSenderFactory {
    public static NotificationSender getNotificationSender(String preference) throws Exception {
        switch (preference.toUpperCase()) {
            case "EMAIL": return new EmailSender();
            case "SMS": return new SmsSender();
            case "WHATSAPP": return new WhatsAppSender();
            default: throw new Exception("Invalid notification preference: " + preference);
        }
    }
}