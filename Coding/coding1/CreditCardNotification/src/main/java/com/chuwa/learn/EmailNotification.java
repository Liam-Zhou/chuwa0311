package com.chuwa.learn;

public class EmailNotification implements NotificationStrategy{
    public void send(String userEmail, String message) {
        try {
            // Simulate sending an email
            System.out.println("Sending email to " + userEmail + ": " + message);
            // Here would be the real email sending logic which could throw exceptions
        } catch (Exception e) {
            throw new NotificationException("Failed to send email", e);
        }
    }
}
