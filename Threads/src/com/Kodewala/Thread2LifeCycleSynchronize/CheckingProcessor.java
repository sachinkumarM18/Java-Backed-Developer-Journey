package com.Kodewala.Thread2LifeCycleSynchronize;

public class  CheckingProcessor {

	public static void main(String[] args) {
		System.out.println("Thread Name : " + Thread.currentThread().getName());
		Thread t2 = new Thread(() -> {
			System.out.println("Thread Name : " + Thread.currentThread().getName());
		});

		Thread t3 = new Thread(() -> {
			System.out.println("Thread Name : " + Thread.currentThread().getName());
		});

		Thread t4 = new Thread(() -> {
			System.out.println("Thread Name : " + Thread.currentThread().getName());
		});

		Thread t5 = new Thread(() -> {
			System.out.println("Thread Name : " + Thread.currentThread().getName());
		});

		Thread t6 = new Thread(() -> {
			System.out.println("Thread Name : " + Thread.currentThread().getName());
		});

		Thread t7 = new Thread(() -> {
			System.out.println("Thread Name : " + Thread.currentThread().getName());
		});

		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
//		int processor = Runtime.getRuntime().availableProcessors();
//		System.out.println("Available Processor : " + processor);
	}

}
