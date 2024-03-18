package CreditNotification;

public class SMSNotification extends NotificationService{
    String number;

    public SMSNotification() {
    }

    public SMSNotification(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void sendNotification() {
        System.out.println("Your phone number: " + number);
    }

    @Override
    public void sendNotification(String s) {
        System.out.println("Via SMS:");
        System.out.println(s);
    }
}
