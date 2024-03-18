public class User {
    private String firstName;
    private String email;
    private String phone;
    private String notificationPreference;

    public User(String firstName, String email, String phone, String notificationPreference) {
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
        this.notificationPreference = notificationPreference;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getNotificationPreference() {
        return notificationPreference;
    }
}
