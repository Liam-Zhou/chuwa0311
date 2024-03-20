
public class EmailNotificationStrategy implements INotificationStrategy {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending Email to " + user.getEmail() + ": ");
        System.out.println("Message: " + message + "\n");
    }
}
