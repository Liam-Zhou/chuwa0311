package org.Notification;

public class NotificationFactory {
	public static NotificationStrategy getNotificationStrategy(String type) {
		switch (type) {
			case "EMAIL":
				return new EmailNotification();
			case "SMS":
				return new SMSNotification();
			case "WHATSAPP":
				return new WhatsAppNotification();
			default:
				throw new IllegalArgumentException("Invalid Notification option");
		}
	}
}
