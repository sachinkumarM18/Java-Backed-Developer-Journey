package com.Kodewala.Thread1;

class Driver5 implements Runnable {

	@Override
	public void run() {
		System.out.println("This code is Running outside of the Thread");
	}

	public static void main(String[] args) {
		Driver5 obj = new Driver5();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("This Code is Running in a Thread");
	}

}
