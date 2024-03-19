public class WhatsAppNotificationStrategy implements NotificationStrategy{
    public void sendNotification(User user, String message) {
        System.out.println("Sending WhatsApp message to " + user.getPhone() + ": " + message);
    }
}
