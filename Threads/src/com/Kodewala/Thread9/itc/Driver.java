package com.Kodewala.Thread9.itc;

public class Driver {

	public static void main(String[] args) {
		Shared shared = new Shared();

		Producer producer = new Producer(shared);
		Consumer consumer = new Consumer(shared);

		producer.start();
		consumer.start();

	}

}
