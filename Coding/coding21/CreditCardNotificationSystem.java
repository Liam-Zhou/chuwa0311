public class CreditCardNotificationSystem {
    public static void main(String[] args) {
        CreditCardNotifier notifier = new CreditCardNotifier();

        NotificationService emailService = new EmailNotificationService();
        NotificationService smsService = new SMSNotificationService();
        NotificationService whatsAppService = new WhatsAppNotificationService();

        notifier.registerObserver(emailService, "email");
        notifier.registerObserver(smsService, "sms");
        notifier.registerObserver(whatsAppService, "whatsApp");

        String userNotification = "Hey John, you have successfully registered to add and here is your 1234567890, please use this for future references.";
        notifier.notifyUsers(userNotification);

        String broadcastNotification = "Broadcast public notification: 40% off when you buy Popeyes between 06/13 - 06/19";
        notifier.broadcastNotification(broadcastNotification);
    }
}