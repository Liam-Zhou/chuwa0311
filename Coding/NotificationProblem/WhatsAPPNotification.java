public class WhatsAPPNotification implements NotificationPreference{
    @Override
    public void sentNotification(User user, String message) {
        System.out.println("Sending WhatsAPP message to " + user.getWhatsapp() + ": " + message);
    }
}
