public class SMSNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(User user) {
        System.out.println("Hey " + user.getFirstName() + ", you have successfully registered to add and here is your preference: " + user.getNotificationPreference() + ". Please use this for future references.");
    }

    @Override
    public void sendBroadcastNotification(String message) {
        System.out.println(message);
    }
}
