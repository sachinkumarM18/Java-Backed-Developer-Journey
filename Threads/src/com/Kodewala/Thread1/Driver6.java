package com.Kodewala.Thread1;

class Task implements Runnable {

	@Override
	public void run() {
//		System.out.println("Task Running...");
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				try {
					System.out.println("Sleeping....");
					Thread.sleep(5000);
					System.out.println("Sleeping Time Over... i just woke up... Started work again");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Printing : " + i);
		}
	}

}

class Driver6 {

	public static void main(String[] args) {
		System.out.println("Driver main start");
		Task task = new Task();
		Thread t1 = new Thread(task);
		t1.start();
		System.out.println("Driver main End");
	}

}
