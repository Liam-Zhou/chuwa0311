public class NotificationService {
    private NotificationFactory factory;

    public NotificationService() {
        this.factory = new NotificationFactory();
    }

    public void sendNotification(User user, String message, String preference){
        try{
            NotificationPreference prefe = factory.getNotificationFactory(preference);
            prefe.sentNotification(user, message);
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void boardcastNotification(String message){
        System.out.println("Boardcast public Notification: " + message);
    }
}
