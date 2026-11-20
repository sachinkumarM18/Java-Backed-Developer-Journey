package com.Kodewala.Thread9.itc;

public class Shared {
	int num;
	boolean ready = false;

	synchronized void produce(int n) throws InterruptedException {
		while (ready) {
			wait();
		}
		num = n;
		System.out.println("Produced : " + n);
		ready = true;
		notify();
	}

	synchronized void consume(int n) throws InterruptedException {
		while (!ready) {
			wait();
		}
		System.out.println("Consumed : " + num);
		ready = false;
		notify();
	}
}
