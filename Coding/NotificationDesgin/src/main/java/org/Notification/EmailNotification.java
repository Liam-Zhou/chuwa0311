package org.Notification;

public class EmailNotification implements NotificationStrategy {

	@Override
	public void sendNotification(User user, String message) throws NotificationException {
		//actual implementation to send Email
	}
}
