package com.sachin.Interface1Notification;

public class Driver {

	public static void main(String[] args) {
		NotificationServices notification;

		notification = new EmailNotification();
		notification.send("Welcome to Gmail");

		notification = new SMSNotification();
		notification.send("Sms Notification from Normal Message");

		notification = new PushNotification();
		notification.send("Pushing Notification On Normal");
	}

}
