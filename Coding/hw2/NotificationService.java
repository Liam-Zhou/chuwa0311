import java.util.HashMap;
import java.util.Map;
class NotificationService {
    private Map<String, User> users;

    public NotificationService() {
        this.users = new HashMap<>();
    }

    // Register a user
    public void registerUser(User user) {
        users.put(user.getEmail(), user);
    }
    // send notification
    public void sendNotification(String email, String message) {
        User user = users.get(email);
        if (user == null) {
            throw new IllegalArgumentException("User with email " + email + " not found.");
        }
        Notification notification = NotificationFactory.getNotification(user.getNotificationPreference());
        notification.sendNotification(user, message);
    }

}