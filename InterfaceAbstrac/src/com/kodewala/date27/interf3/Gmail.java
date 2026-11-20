package com.kodewala.date27.interf3;

public class Gmail implements INotification{

	@Override
	public void send(String msg) {
		
		System.out.println(" From Gmail🎁 " + msg);
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
