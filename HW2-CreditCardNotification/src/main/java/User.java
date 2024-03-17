public class User {
    private String firstName;
    private String email;
    private String phoneNumber;
    private String notificationPreference;
    private String whatsAPPID;

    public User(String firstName, String email, String phoneNumber, String whatsAPPID, String notificationPreference) {
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.notificationPreference = notificationPreference;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getNotificationPreference() {
        return notificationPreference;
    }

    public void setNotificationPreference(String notificationPreference) {
        this.notificationPreference = notificationPreference;
    }

    public String getWhatsAPPID() {
        return whatsAPPID;
    }

    public void setWhatsAPPID(String whatsAPPID) {
        this.whatsAPPID = whatsAPPID;
    }


    public java.lang.String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", notificationPreference='" + notificationPreference + '\'' +
                ", whatsAPPID='" + whatsAPPID + '\'' +
                '}';
    }


}