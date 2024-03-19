public class SMSNotificationStrategy implements INotificationStrategy {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending SMS to " + user.getPhoneNumber() + ": ");
        System.out.println("Message: " + message + "\n");
    }
}
