package org.example;

public class EmailNotification implements NotificationStrategy{

    @Override
    public void notify(User user, String message) {
        System.out.println("Send " + user.getEmail() + " to "  + user.getName() +": " +message);
    }
}
