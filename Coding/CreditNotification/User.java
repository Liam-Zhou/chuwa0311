package CreditNotification;

public class User {
    String name;
    String phoneNumber;
    String accountNumber;
    String emailAddress;
    NotificationType preferredType;
    EmailNotification emailNotification;
    SMSNotification smsNotification;
    WhatsappNotification whatsappNotification;
    NotificationService preferredNotification;

    public User() {
        emailNotification = new EmailNotification();
        smsNotification = new SMSNotification();
        whatsappNotification = new WhatsappNotification();

    }

    public User(String name, String phoneNumber, String accountNumber, String emailAddress, NotificationType preferredType) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.emailAddress = emailAddress;
        this.preferredType = preferredType;

        emailNotification = new EmailNotification(emailAddress);
        smsNotification = new SMSNotification(phoneNumber);
        whatsappNotification = new WhatsappNotification(accountNumber);

        switch(preferredType) {
            case Email:
                preferredNotification = emailNotification;
                break;
            case SMS:
                preferredNotification = smsNotification;
                break;
            case Whatsapp:
                preferredNotification = whatsappNotification;
                break;
            default:
                preferredNotification = emailNotification;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        smsNotification.setNumber(phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        whatsappNotification.setAccount(accountNumber);
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        emailNotification.setEmail(emailAddress);
    }

    public NotificationType getPreferredType() {
        return preferredType;
    }

    public void setPreferredType(NotificationType preferredType) {
        this.preferredType = preferredType;
        switch(preferredType) {
            case Email:
                preferredNotification = emailNotification;
                break;
            case SMS:
                preferredNotification = smsNotification;
                break;
            case Whatsapp:
                preferredNotification = whatsappNotification;
                break;
            default:
                preferredNotification = emailNotification;
        }
    }

    public EmailNotification getEmailNotification() {
        return emailNotification;
    }

    public SMSNotification getSmsNotification() {
        return smsNotification;
    }

    public WhatsappNotification getWhatsappNotification() {
        return whatsappNotification;
    }

    public NotificationService getPreferredNotification() {
        return preferredNotification;
    }

    public void sendNotification() {
        preferredNotification.sendNotification();
    }

    public void sendNotification(String s) {
        preferredNotification.sendNotification(s);
    }


}
