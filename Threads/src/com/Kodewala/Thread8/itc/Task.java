package com.Kodewala.Thread8.itc;

public class Task {
	int data;
	boolean isDataAvailable = false;

	// Producer
	public synchronized void produce(int data) throws InterruptedException {
		while (isDataAvailable) {
			System.out.println("[" + Thread.currentThread().getName() + "] is waiting...");
			wait();
		}
		this.data = data;
		System.out.println("Produced the data : " + data); 
		isDataAvailable = true;

		System.out.println("Producer notifying the consumer"); 
		notify();
	}

	// Consumer
	public synchronized void consume(int data) throws InterruptedException {
		while (!isDataAvailable) {
			System.out.println("[" + Thread.currentThread().getName() + "] is waiting...");
			wait();
		}
		System.out.println("Consuming the data : " + data);
		isDataAvailable = false;

		System.out.println("Consumer notifying the consumer");
		notify(); // notify the producer so that producer can generate/produce more data
	}
}
