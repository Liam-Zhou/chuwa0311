public class NotificationService {
    public void notifyUser(User user, String message) {
        try {
            INotificationStrategy strategy = NotificationStrategyFactory.getStrategy(user.getNotificationPreference());
            strategy.sendNotification(user, message);
        } catch (Exception e) {
            e.printStackTrace();
            // Handle error appropriately
        }
    }
}