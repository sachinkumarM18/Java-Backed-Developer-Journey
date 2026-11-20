package com.sachin.polymor1;

class Notification {
	public void sendNotification() {
		System.out.println("Sending Notification....");
	}
}

class EmailNotification extends Notification {
	@Override
	public void sendNotification() {
		System.out.println("Sending Notification By Email...");
	}
}

class SMSNotificatio extends Notification {
	@Override
	public void sendNotification() {
		System.out.println("Sending Notification By SMS...");
	}
}

public class Driver2 {

	public static void main(String[] args) {
		Notification n0 = new Notification();
		// Compile Time : SendNotification in Notification classes
		// Runtime : Calls the send NOtification() of Notification
		n0.sendNotification();

		Notification n1 = new EmailNotification();
		// Parent class referring child class object
		// Compile Time : Calls the sendNotification() of EmailNotification
		n1.sendNotification();

		Notification n2 = new SMSNotificatio(); // Parent class referring child class Object
		// Compile time : sendNotification() in Notification class
		// Runtime : Calls the sendNotification() of SmsNotification
		n2.sendNotification();
	}

}
