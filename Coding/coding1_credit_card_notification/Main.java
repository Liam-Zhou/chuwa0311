public class Main {
    public static void main(String[] args) {
        // Create NotificationService instance
        Notification notification = new Notification();

        // Set notification strategy based on user preference
        String userPreference = "EMAIL";
        String firstName = "John"; // Example user
        String notificationContent = "Hey " + firstName + ", you have successfully registered!";
        NotificationStrategy notificationStrategy = new NotificationStrategy(userPreference, firstName,notificationContent);

        notification.setNotificationStrategy(notificationStrategy);

        // Send notification
//        String firstName = "John"; // Example user
//        String notificationContent = "Hey " + firstName + ", you have successfully registered!";
//        notificationService.notifyUser(firstName, notificationContent);
    }
}
