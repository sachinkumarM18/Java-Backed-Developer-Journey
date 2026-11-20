package com.Kodewala.Thread1;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is Running");
	}
}

class Driver2 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		System.out.println("Main Thread is Running");
	} 
}
