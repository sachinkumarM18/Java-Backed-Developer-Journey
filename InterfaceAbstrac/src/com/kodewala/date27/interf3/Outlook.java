package com.kodewala.date27.interf3;

public class Outlook implements INotification{

	@Override
	public void send(String msg) {
		System.out.println("OutLook is Here for You " + msg);
	}

	@Override
	public void schedule(String msg) {
		System.out.println(msg);
	}

	@Override
	public void status() {
		System.out.println("Done");
	}

}
