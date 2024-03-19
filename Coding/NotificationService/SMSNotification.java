package NotificationService;

public class SMSNotification implements Notification{
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
        // Code to send SMS notification
    }
}
