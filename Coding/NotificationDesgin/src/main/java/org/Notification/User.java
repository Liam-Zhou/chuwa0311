package org.Notification;

public class User {
	private String Name;
	private String notificationPreference;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNotificationPreference() {
		return notificationPreference;
	}

	public void setNotificationPreference(String notificationPreference) {
		this.notificationPreference = notificationPreference;
	}
}
