public class WhatsAppNotificationStrategy implements INotificationStrategy {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending WhatsApp message to " + user.getPhoneNumber() + ": ");
        System.out.println("Message: " + message + "\n");
    }
}
