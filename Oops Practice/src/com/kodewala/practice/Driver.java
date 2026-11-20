package com.kodewala.practice;

public class Driver {

	public static void main(String[] args) {
		Notification n = new Notification();
		
		n = new EmailNotification();
		n.sendNotification();
		
		n = new SMSNotification();
		n.sendNotification();
		
		n = new PushNotification();
		n.sendNotification();

	}

}
