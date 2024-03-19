// Define the EmailNotification class
class EmailNotification implements Notification {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending email notification to " + user.getEmail() + ": " + message);
    }
}