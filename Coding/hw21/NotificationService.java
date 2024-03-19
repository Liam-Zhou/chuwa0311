import java.util.List;

public class NotificationService {
    public void sendNotification(User user) {
        try {
            NotificationStrategy strategy = NotificationStrategyFactory.getNotificationStrategy(user);
            strategy.sendNotification(user);
        } catch (NotificationException e) {
            e.printStackTrace();
        }
    }

    public void broadcastNotification(List<User> users, String message) {
        for (User user : users) {
            try {
                NotificationStrategy strategy = NotificationStrategyFactory.getNotificationStrategy(user);
                strategy.sendBroadcastNotification(message);
            } catch (NotificationException e) {
                e.printStackTrace();
            }
        }
    }
}
