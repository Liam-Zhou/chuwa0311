package NotificationService;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
        // Code to send email notification
    }
}
