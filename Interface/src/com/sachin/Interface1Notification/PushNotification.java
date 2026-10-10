package com.sachin.Interface1Notification;

public class PushNotification implements NotificationServices {

	@Override
	public void send(String message) {
		System.out.println("You got Push Notification");
	}

}
