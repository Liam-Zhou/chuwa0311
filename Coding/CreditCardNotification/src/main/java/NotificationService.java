class NotificationService {
    public void notifyUser(User user, String message) {
        try {
            NotificationSender sender = NotificationSenderFactory.getNotificationSender(user.getNotificationPreference());
            sender.sendNotification(user, message);
        } catch (Exception e) {
            System.err.println("Failed to send notification: " + e.getMessage());
        }
    }
}