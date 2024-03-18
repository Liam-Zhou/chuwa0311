public class Main {
    public static void main(String[] args) {
        User user = new User("Zjd", "zjd@gmail.com", "123456789", "EMAIL");
        NotificationService service = new NotificationService();
        service.notifyUser(user, "you have successfully registered.");
        service.notifyUser(user, "40% off when you buy Popeyes between 06/13 - 06/19");
    }
}