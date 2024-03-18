package CreditNotification;

public class Main {

    public static void main(String[] args) {
        User yingqi = new User("Yingqi He", "213-705-9527", "213-705-9527",
                "yuckyhe@gmail.com", NotificationType.SMS);


        System.out.println("********************");
        yingqi.sendNotification();

        System.out.println("********************");
        String s = String.format("Hey %s, you have successfully registered to add and here is your , please use this for future reference",
                yingqi.getName());
        yingqi.sendNotification(s);

        yingqi.setPreferredType(NotificationType.Whatsapp);
        System.out.println("********************");
        s = "40% off when you buy Popeyes between 06/13 - 06/19";
        yingqi.sendNotification(s);

    }
}
