// Define the WhatsAppNotification class
class WhatsAppNotification implements Notification {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending WhatsApp notification to " + user.getWhatsAppNumber() + ": " + message);
    }
}