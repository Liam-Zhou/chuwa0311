package NotificationService;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    private String whatsAppId;
    private String notificationPreference;

    // Constructor
    public User(String firstName, String lastName, String email, String phoneNumber, String whatsAppId, String notificationPreference) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.whatsAppId = whatsAppId;
        this.notificationPreference = notificationPreference;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getWhatsAppId() {
        return this.whatsAppId;
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

    public String getNotificationPreference() {
        return notificationPreference;
    }

    public void setNotificationPreference(String notificationPreference) {
        this.notificationPreference = notificationPreference;
    }
}

