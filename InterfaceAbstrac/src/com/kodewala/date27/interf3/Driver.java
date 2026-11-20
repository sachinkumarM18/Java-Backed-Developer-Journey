package com.kodewala.date27.interf3;

public class Driver {

	public static void main(String[] args) {
		processNotification(new Gmail());
		System.out.println("----------------");
		
		processNotification(new Outlook());
		System.out.println("----------------");
		
		processNotification(new WhatsApp());
		System.out.println("----------------");
		
		processNotification(new Instagram());

	}
	private static void processNotification(INotification notificationServoce) {
		notificationServoce.send("Welcome User");
		notificationServoce.schedule("Otp : 25265");
		notificationServoce.status();
	}

}
