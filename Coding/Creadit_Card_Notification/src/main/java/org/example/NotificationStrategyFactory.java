package org.example;

import java.lang.invoke.SwitchPoint;

public class NotificationStrategyFactory {

    public static NotificationStrategy getNotification(String preference) throws Exception{
        switch(preference){
            case "EMAIL":
                return new EmailNotification();
            case "PHONENUMBER":
                return new PhoneNotification();
            case "WHATSAPP":
                return new WhatsappNotification();
            default:
                throw new Exception("exception");
        }
    }
}
