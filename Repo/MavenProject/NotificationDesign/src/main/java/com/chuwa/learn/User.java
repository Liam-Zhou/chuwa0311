package com.chuwa.learn;

// Encapsulation
public class User {
    private String name;
    private String email;
    private String phoneNumber;
    private String whatsAppNumber;
    private String notificationPreference;

    public User(String name, String email, String phoneNumber, String whatsAppNumber, String notificationPreference) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.whatsAppNumber = whatsAppNumber;
        this.notificationPreference = notificationPreference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWhatsAppNumber() {
        return whatsAppNumber;
    }

    public void setWhatsAppNumber(String whatsAppNumber) {
        this.whatsAppNumber = whatsAppNumber;
    }

    public String getNotificationPreference() {
        return notificationPreference;
    }

    public void setNotificationPreference(String notificationPreference) {
        this.notificationPreference = notificationPreference;
    }
}
