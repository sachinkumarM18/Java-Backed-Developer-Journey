package com.Kodewala.Thread10.reentrentLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Task {
	private int data;
	private boolean isDataAvailable = false;

	private final ReentrantLock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();

	// Producer
	public void produce(int data) throws InterruptedException {
		lock.lock();
		try {
			while (isDataAvailable) {
				System.out.println("[" + Thread.currentThread().getName() + "] Producer is waiting...");
				condition.await();
			}
			this.data = data;

			System.out.println("Produced data : " + data);
			isDataAvailable = true;

			System.out.println("Producer notifying consumer");
			condition.signal();
		} finally {
			lock.unlock();

		}
	}

	// Consumer
	public void consume() throws InterruptedException {
		lock.lock();
		try {
			while (!isDataAvailable) {
				System.out.println("[" + Thread.currentThread().getName() + "] Consumer is waiting...");
				condition.await();
			}
			System.out.println("Consumed data : " + data);
			isDataAvailable = false;
			System.out.println("Consumer notifying producer");
			condition.signal();
		} finally {
			lock.unlock();
		}
	}
}
