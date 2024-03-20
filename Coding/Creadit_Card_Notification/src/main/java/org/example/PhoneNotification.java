package org.example;

public class PhoneNotification implements NotificationStrategy{
    @Override
    public void notify(User user, String message) {
        System.out.println("Send " + user.getPhoneNumber() + " to "  + user.getName() +": " +message);
    }
}
