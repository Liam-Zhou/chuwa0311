package NotificationService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Tiffany", "Chen", "tiffanyc4484@gmail.com", "103-222-2222", "0000", "SMS");

        User user2 = new User("Chris", "Pan", "chrispan@gmail.com", "22222", "4444", "EMAIL");

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);

        String publicMessage = "40% off when you buy Popeyes between 06/13 - 06/19";

         for (User user : userList){
             String userPreference = user.getNotificationPreference();
             String recipent = "";
             if (userPreference.equals("SMS")) {
                 recipent = user.getPhoneNumber();
             }  else if (userPreference.equals("EMAIL")) {
                 recipent = user.getEmail();
             } else {
                 recipent = user.getWhatsAppId();
             }
             NotificationService.sendNotification(userPreference, recipent, publicMessage);
         }
    }
}
