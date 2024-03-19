package NotificationService;

public class WhatsAppNotification implements Notification{
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending WhatsApp message to " + recipient + ": " + message);
        // Code to send WhatsApp notification
    }
}
