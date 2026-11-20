package com.Kodewala.Thread1;

class Main2 extends Thread {
	public static int amount = 0;

	public void run() {
		amount++;
	}

	public static void main(String[] args) {
		Main2 thread = new Main2();
		thread.start();

		// wait for the thread to finish

		while (thread.isAlive()) {
			System.out.println("Waiting...");
		}

		// Update amount and print its value

		System.out.println("Main : " + amount);
		amount++;

		System.out.println("Main : " + amount);

	}

}
