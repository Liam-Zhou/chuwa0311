class WhatsAppNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending WhatsApp notification: " + message);
    }
}
