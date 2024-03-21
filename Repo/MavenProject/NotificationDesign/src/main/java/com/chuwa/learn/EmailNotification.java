package com.chuwa.learn;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("sending email to " + user.getEmail() + " : " + message );
    }
}
