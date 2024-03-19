public class Notification {
    private NotificationStrategy notificationStrategy;

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void notifyUser(String firstName, String notificationContent) {
        if (notificationStrategy != null) {
            notificationStrategy.sendNotification(firstName, notificationContent);
        } else {
            throw new IllegalArgumentException("Invalid notification preference");
        }
    }
}
