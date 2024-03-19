import java.util.*;
class CreditCardNotifier {
    private List<NotificationService> observers;
    private List<String> userPreferences;

    public CreditCardNotifier() {
        observers = new ArrayList<>();
        userPreferences = new ArrayList<>();
    }

    public void registerObserver(NotificationService observer, String userPreference) {
        observers.add(observer);
        userPreferences.add(userPreference);
    }

    public void notifyUsers(String message) {
        for (int i = 0; i < observers.size(); i++) {
            String preference = userPreferences.get(i);
            NotificationService observer = observers.get(i);

            switch (preference.toLowerCase()) {
                case "email":
                    observer.sendNotification(message);
                    break;
                case "sms":
                    observer.sendNotification(message);
                    break;
                case "whatsapp":
                    observer.sendNotification(message);
                    break;
                default:
                    System.out.println("Invalid preference: " + preference);
            }
        }
    }

    public void broadcastNotification(String message) {
        for (NotificationService observer : observers) {
            observer.sendNotification(message);
        }
    }
}
