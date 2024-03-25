public class Main {
    public static void main(String[] args) {
        // User details
        String firstName = "John";
        String notificationPreference = "EMAIL"; // Example preference, can be retrieved from user data

        // Notification content
        String message = "Hey " + firstName + ", you have successfully registered to add and here is your , please use this for future references.";

        try {
            // Create Notification based on preference
            NotificationFactory factory = new NotificationFactory();
            Notification notification = factory.createNotification(notificationPreference);

            // Send notification
            notification.sendNotification(firstName, message);

        } catch (IllegalArgumentException e) {
            // Handle invalid preference
            System.err.println("Error: " + e.getMessage());
        }
    }
}
