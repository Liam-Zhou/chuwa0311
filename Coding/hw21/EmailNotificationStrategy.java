public class EmailNotificationStrategy implements NotificationStrategy{
    public void sendNotification(User user, String message) {
        System.out.println("Sending email to " + user.getEmail() + ": " + message);
    }
}
