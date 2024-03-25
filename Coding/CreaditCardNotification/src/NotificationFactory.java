class NotificationFactory {
    // Method to create Notification based on preference
    public Notification createNotification(String preference) {
        switch (preference) {
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
