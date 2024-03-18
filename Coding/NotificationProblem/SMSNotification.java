public class SMSNotification implements NotificationPreference{
    @Override
    public void sentNotification(User user, String message) {
        System.out.println("Sending SMS message to " + user.getPhoneNumber() + ": " + message);
    }
}
