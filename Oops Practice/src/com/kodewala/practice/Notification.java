package com.kodewala.practice;

 class Notification 
 {
	 void sendNotification()
	{
		 System.out.println("Notification.sendNotification()");
	} 
 }
 
 class EmailNotification extends Notification
 	{
		void sendNotification()
		{
			 System.out.println("Notification.EmailNotification.sendNotification() ---Email Notification");
		 }
	}

 class SMSNotification extends Notification
 {
	 void sendNotification()
	 {
		 System.out.println("SMSNotification.sendNotification() ----SMS Notification");
	 }
 }
 
 class PushNotification extends Notification
 {
	 void sendNotification()
	 {
		 System.out.println("PushNotification.sendNotification() ---Push Notification");
	 }
 }
 
 class WhatsAppNotification extends Notification
 {
	 void sendNotification()
	 {
		 System.out.println("WhatsAppNotification.sendNotification() ---What's App ");
	 }
 }






/*
Problem Statement:

Create a Notification parent class with a method sendNotification().
Create child classes:
	•	EmailNotification
	•	SMSNotification
	•	PushNotification

Each child class should display a different notification message
*/