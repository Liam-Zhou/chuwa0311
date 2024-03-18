public class EmailNotification implements NotificationPreference {
    @Override
    public void sentNotification(User user, String message) {
        System.out.println("Sending email notification to " + user.getEmail() + ": " + message);
    }
}
