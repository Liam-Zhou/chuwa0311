public class SMSNotificationStrategy implements NotificationStrategy{
    public void sendNotification(User user, String message) {
        System.out.println("Sending SMS to " + user.getPhone() + ": " + message);
    }
}
