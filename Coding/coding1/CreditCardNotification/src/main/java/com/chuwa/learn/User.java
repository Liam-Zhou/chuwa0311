package com.chuwa.learn;

public class User {
    private String name;
    private String contact;
    private NotificationStrategy notificationStrategy;

    public User(String name, String contact, NotificationStrategy notificationStrategy) {
        this.name = name;
        this.contact = contact;
        this.notificationStrategy = notificationStrategy;
    }

    public void notifyUser(String message) {
        try {
            notificationStrategy.send(contact, message.replace("firstName", name));
        } catch (NotificationException e) {
            System.out.println("Error notifying user " + name + ": " + e.getMessage());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public NotificationStrategy getNotificationStrategy() {
        return notificationStrategy;
    }
}
