package org.example;

import java.util.List;

public class Notification {
    private String type;
    public void send(User user, String message){
        try{
            NotificationStrategy strategy = NotificationStrategyFactory.getNotification(user.getPreference());
            strategy.notify(user, message);
        }
        catch (Exception e){
            System.out.println("catch");
        }
    };

    public void broadcast(List<User> users, String message){
        for(User user:users){
            send(user, message);
        }
    };
}
