package com.Kodewala.Thread2LifeCycleSynchronize;

public class ExceptionCheckingWithSleep {
	public static void main(String[] args) {
		System.out.println("main Thread..");
		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(5000);
				System.out.println("Sleeping for 1s");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Worked Finished....");
		});
		t1.start();
	}

}
