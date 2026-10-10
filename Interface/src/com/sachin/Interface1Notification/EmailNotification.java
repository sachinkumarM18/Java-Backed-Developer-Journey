package com.sachin.Interface1Notification;

public class EmailNotification implements NotificationServices{

	@Override
	public void send(String message) {
		System.out.println("You got a Email Notification");
		
	}

}
