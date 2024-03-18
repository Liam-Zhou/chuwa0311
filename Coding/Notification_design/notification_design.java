// Enum for Notification Types
public enum NotificationType {
    EMAIL, SMS, WHATSAPP
}

// Notification Strategy Interface
interface NotificationStrategy {
    void sendNotification(User user, String message);
}

// Concrete Notification Strategy Classes
class EmailNotificationStrategy implements NotificationStrategy {
    public void sendNotification(User user, String message) {
        System.out.println("Email to " + user.getEmail() + ": " + message);
    }
}

class SmsNotificationStrategy implements NotificationStrategy {
    public void sendNotification(User user, String message) {
        System.out.println("SMS to " + user.getPhoneNumber() + ": " + message);
    }
}

class WhatsAppNotificationStrategy implements NotificationStrategy {
    public void sendNotification(User user, String message) {
        System.out.println("WhatsApp to " + user.getPhoneNumber() + ": " + message);
    }
}

// User Class
class User {
    private String firstName;
    private String email;
    private String phoneNumber;
    private NotificationType preference;

    // Constructor, Getters and Setters
}

// Custom Exception Class
class UnsupportedNotificationPreferenceException extends Exception {
    public UnsupportedNotificationPreferenceException(String message) {
        super(message);
    }
}

// Notification Service Class
class NotificationService {
    public void notifyUser(User user, String message) throws UnsupportedNotificationPreferenceException {
        NotificationStrategy strategy = getStrategy(user.getPreference());
        strategy.sendNotification(user, message);
    }

    private NotificationStrategy getStrategy(NotificationType preference) throws UnsupportedNotificationPreferenceException {
        switch (preference) {
            case EMAIL:
                return new EmailNotificationStrategy();
            case SMS:
                return new SmsNotificationStrategy();
            case WHATSAPP:
                return new WhatsAppNotificationStrategy();
            default:
                throw new UnsupportedNotificationPreferenceException("Unsupported notification preference: " + preference);
        }
    }

    public void broadcastPublicNotification(List<User> users, String message) {
        for (User user : users) {
            try {
                notifyUser(user, message);
            } catch (UnsupportedNotificationPreferenceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

// Main class to run the application
public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        List<User> users = new ArrayList<>(); // Assume this is populated with user data

        // Sample registration notification
        User newUser = new User();
        newUser.setFirstName("John");
        newUser.setEmail("john.doe@example.com");
        newUser.setPhoneNumber("+123456789");
        newUser.setPreference(NotificationType.EMAIL);

        String registrationMessage = "Hey " + newUser.getFirstName() + ", you have successfully registered to add and here is your , please use this for future references.";

        try {
            service.notifyUser(newUser, registrationMessage);
        } catch (UnsupportedNotificationPreferenceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Sample broadcast notification
        String broadcastMessage = "40% off when you buy Popeyes between 06/13 - 06/19";
        service.broadcastPublicNotification(users, broadcastMessage);
    }
