public interface NotificationStrategy {
    void sendNotification(User user, String message) throws NotificationException;
}
