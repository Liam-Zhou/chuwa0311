public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        User user = new User("Allison", "Allison@gmail.com", "979123", "Allison123");
        // If user prefer email
        service.sendNotification(user, "Hey "+ user.getName() + ", you have successfully registered to add and here is your , please use this for \n" +
                "future references.", "EMAIL");

        service.boardcastNotification("40% off when you buy Popeyes between 06/13 - 06/19");
    }
}
