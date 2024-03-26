public class NotificationService {
    public static void sendPersonalNotification(User user, String content) {
        try {
            NotificationStrategy strategy = NotificationFactory.getNotificationStrategy(user.getNotificationPreference());
            strategy.sendNotification(user, content);
        } catch (NotificationException e) {
            System.err.println("Error sending notification: " + e.getMessage());
        }
    }

    public static void broadcastPublicNotification(User[] users, String content) {
        for (User user : users) {
            sendPersonalNotification(user, content);
        }
    }

    public static void main(String[] args) {
        User userA = new User("Alice", "alice@example.com", "+123456789", "email");
        String personalContent = "Hey " + userA.getFirstName() + ", you have successfully registered. Please use this for future references.";
        sendPersonalNotification(userA, personalContent);

        User[] users = { userA, new User("Bob", "bob@example.com", "+987654321", "sms") };
        String publicContent = "40% off when you buy Popeyes between 06/13 - 06/19";
        broadcastPublicNotification(users, publicContent);
    }
}
