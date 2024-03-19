public class NotificationStrategy {
    private String type;
    private String firstName;
    private String notificationContent;

    public NotificationStrategy(String type, String firstName, String notificationContent) {
        this.type = type;
        this.firstName = firstName;
        this.notificationContent = notificationContent;
    }

    void sendNotification(String firstName, String notificationContent) {
        System.out.println("Sending" + type + "notification to " + firstName + ": " + notificationContent);
    }

}
