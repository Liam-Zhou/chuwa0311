// Define the SMSNotification class
class SMSNotification implements Notification {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending SMS notification to " + user.getPhoneNumber() + ": " + message);
    }
}