class User {
    private String firstName;
    private String notificationPreference;

    // Constructor
    public User(String firstName, String notificationPreference) {
        this.firstName = firstName;
        this.notificationPreference = notificationPreference;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getNotificationPreference() {
        return notificationPreference;
    }
}
