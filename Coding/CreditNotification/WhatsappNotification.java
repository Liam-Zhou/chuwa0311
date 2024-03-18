package CreditNotification;

public class WhatsappNotification extends NotificationService{
    String account;

    public WhatsappNotification() {
    }

    public WhatsappNotification(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }


    @Override
    public void sendNotification() {
        System.out.println("Your Whatsapp Account:" + account);
    }

    @Override
    public void sendNotification(String s) {
        System.out.println("Via Whatsapp:");
        System.out.println(s);
    }
}
