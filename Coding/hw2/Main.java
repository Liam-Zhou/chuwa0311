public class Main {
    public static void main(String[] args) {
        // Create notification service
        NotificationService notificationService = new NotificationService();

        // Register users
        User user1 = new User("John", "john@example.com", "+1234567890", "+1234567890", "EMAIL");
        User user2 = new User("Alice", "alice@example.com", "+9876543210", "+9876543210", "SMS");
        notificationService.registerUser(user1);
        notificationService.registerUser(user2);

        // Send notifications
        try {
            notificationService.sendNotification("john@example.com", "Hey " + user1.getName() + ", you have successfully registered!");
            notificationService.sendNotification("alice@example.com", "Hey " + user2.getName() + ", you have successfully registered!");
            // Trying to send notification to non-existing user
            notificationService.sendNotification("bob@example.com", "Hello Bob!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}