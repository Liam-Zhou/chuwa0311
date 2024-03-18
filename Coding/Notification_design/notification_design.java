interface NotificationStrategy {
    void sendNotification(User user, String message);
}

class EmailNotificationStrategy implements NotificationStrategy {
    public void sendNotification(User user, String message) {
        System.out.println("Sending Email to " + user.getEmail() + ": " + message);
    }
}

class SmsNotificationStrategy implements NotificationStrategy {
    public void sendNotification(User user, String message) {
        System.out.println("Sending SMS to " + user.getPhoneNumber() + ": " + message);
    }
}

class WhatsAppNotificationStrategy implements NotificationStrategy {
    public void sendNotification(User user, String message) {
        System.out.println("Sending WhatsApp message to " + user.getPhoneNumber() + ": " + message);
    }
}

class User {
    private String firstName;
    private String email;
    private String phoneNumber;
    private String notificationPreference; // Could be "EMAIL", "SMS", or "WHATSAPP"

    // Constructors, getters, and setters
}

class UnsupportedNotificationPreferenceException extends Exception {
    public UnsupportedNotificationPreferenceException(String message) {
        super(message);
    }
}

class NotificationService {
    public void notifyUser(User user, String message) throws UnsupportedNotificationPreferenceException {
        NotificationStrategy strategy = null;

        switch (user.getNotificationPreference().toUpperCase()) {
            case "EMAIL":
                strategy = new EmailNotificationStrategy();
                break;
            case "SMS":
                strategy = new SmsNotificationStrategy();
                break;
            case "WHATSAPP":
                strategy = new WhatsAppNotificationStrategy();
                break;
            default:
                throw new UnsupportedNotificationPreferenceException("Unsupported notification preference: " + user.getNotificationPreference());
        }

        strategy.sendNotification(user, message);
    }

    public void broadcastPublicNotification(List<User> users, String message) {
        for (User user : users) {
            try {
                notifyUser(user, message);
            } catch (UnsupportedNotificationPreferenceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
