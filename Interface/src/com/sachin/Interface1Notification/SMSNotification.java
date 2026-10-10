package com.sachin.Interface1Notification;

public class SMSNotification implements NotificationServices{

	@Override
	public void send(String message) {
		System.out.println("You got a SMS Notification");
	}

}
