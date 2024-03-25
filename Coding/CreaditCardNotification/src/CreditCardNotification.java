import java.util.*;
public class CreditCardNotification {
    public static void main(String[] args) {
        // Notification content
        String message = "40% off when you buy Popeyes between 06/13 - 06/19";

        // Send notification to all users
        sendPublicNotification(message);
    }

    // Method to send public notification to all users
    public static void sendPublicNotification(String message) {
        // User details can be retrieved from a database or other data source
        List<User> userList = getAllUsers(); // Assume getAllUsers() retrieves all users from the database

        // Notification content
        String notificationMessage = "Public Notification: " + message;

        // Create Notification Factory
        NotificationFactory factory = new NotificationFactory();

        // Send notification to each user
        for (User user : userList) {
            try {
                // Create Notification based on user's preference
                Notification notification = factory.createNotification(user.getNotificationPreference());

                // Send notification
                notification.sendNotification(user.getFirstName(), notificationMessage);

            } catch (IllegalArgumentException e) {
                // Handle invalid preference
                System.err.println("Error sending notification to " + user.getFirstName() + ": " + e.getMessage());
            }
        }
    }

    // Method to retrieve all users (sample implementation)
    public static List<User> getAllUsers() {
        // Sample implementation to return a list of users
        List<User> userList = new ArrayList<>();
        // Add sample users
        userList.add(new User("John", "EMAIL")); // Example user with EMAIL preference
        userList.add(new User("Alice", "SMS"));  // Example user with SMS preference
        // Add more users...
        return userList;
    }
}
