public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String whatsAppId;
    private NotificationType notificationPreference;

    public User(String firstName, String lastName, String email, String phone, String whatsAppId, NotificationType notificationPreference) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.whatsAppId = whatsAppId;
        this.notificationPreference = notificationPreference;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWhatsAppId() {
        return whatsAppId;
    }

    public NotificationType getNotificationPreference() {
        return notificationPreference;
    }
}
