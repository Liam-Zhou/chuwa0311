public class WhatsAppNotification implements Notification {
    @Override
    public void sendNotification(String firstName, String message) {
        // Implementation to send WhatsApp notification
        System.out.println("Sending WhatsApp notification to " + firstName + ": " + message);
    }
}
