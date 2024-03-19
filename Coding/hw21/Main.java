import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        User user1 = new User("Ethan", "Lin", "ethanlin@gmail.com", "666-888-6688", "ethan.lin", NotificationType.EMAIL);
        service.sendNotification(user1);

        User user2 = new User("Zifeng", "Lin", "zifenglin@gmail.com", "666-888-8888", "zifenglin", NotificationType.SMS);
        User user3 = new User("Elliot", "Zhang", "elliotzhang@gmail.com", "666-888-6666", "ElliotZhang", NotificationType.WHATSAPP);

        List<User> users = Arrays.asList(user1, user2, user3);
        service.broadcastNotification(users, "40% off when you buy Popeyes between 06/13 - 06/19");
    }
}