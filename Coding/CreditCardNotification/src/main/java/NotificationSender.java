interface NotificationSender {
    void sendNotification(User user, String message);
}

class EmailSender implements NotificationSender {
    public void sendNotification(User user, String message) {
        System.out.println("Sending email to " + user.getEmail() + ": " + message);
    }
}

class SmsSender implements NotificationSender {
    public void sendNotification(User user, String message) {
        System.out.println("Sending SMS to " + user.getPhoneNumber() + ": " + message);
    }
}

class WhatsAppSender implements NotificationSender {
    public void sendNotification(User user, String message) {
        System.out.println("Sending WhatsApp message to " + user.getPhoneNumber() + ": " + message);
    }
}