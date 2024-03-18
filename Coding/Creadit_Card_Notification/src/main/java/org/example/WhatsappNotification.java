package org.example;

public class WhatsappNotification implements NotificationStrategy{
    @Override
    public void notify(User user, String message) {
        System.out.println("Send " + user.getWhatsapp() + " to "  + user.getName() +": " +message);
    }
}
