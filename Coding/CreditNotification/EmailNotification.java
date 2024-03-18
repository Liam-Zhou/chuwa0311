package CreditNotification;

import com.sun.nio.sctp.Association;
import com.sun.nio.sctp.Notification;

public class EmailNotification extends NotificationService {
    String email;

    public EmailNotification() {
    }

    public EmailNotification(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void sendNotification() {
        System.out.println("Your Email Address: " + email);
    }

    @Override
    public void sendNotification(String s) {
        System.out.println("Via Email:");
        System.out.println(s);
    }
}
