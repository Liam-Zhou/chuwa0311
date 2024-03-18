class User {
    private String firstName;
    private String email;
    private String phoneNumber;
    private String notificationPreference;

    public User(String firstName, String email, String phoneNumber, String notificationPreference) {
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.notificationPreference = notificationPreference;
    }

    public String getFirstName() { return firstName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getNotificationPreference() { return notificationPreference; }
}