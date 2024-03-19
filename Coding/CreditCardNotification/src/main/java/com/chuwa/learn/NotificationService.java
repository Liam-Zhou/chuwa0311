package com.chuwa.learn;

import java.util.HashMap;
import java.util.Map;

class NotificationService {
    private Map<String, String> map;

    public NotificationService() {
        map = new HashMap<>();
    }

    public void addUserPreference(String userId, String preference) {
        map.put(userId, preference);
    }

    public void notifyUser(String id, String name, String message) throws NotificationException {
        String preference = map.get(id);
        if (preference == null) {
            throw new NotificationException("Error: Preference not found for user " + id);
        }

        Notification notification = NotificationFactory.createNotification(preference);
        notification.sendNotification(name, message);
    }

    public void broadcastNotification(String message) throws NotificationException {
        for (String id : map.keySet()) {
            notifyUser(id, "", message);
        }
    }
}
