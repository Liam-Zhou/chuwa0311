public interface NotificationStrategy {
    public void sendNotification(User user);

    public void sendBroadcastNotification(String message);
}
