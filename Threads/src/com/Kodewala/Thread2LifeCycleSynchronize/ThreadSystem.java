package com.Kodewala.Thread2LifeCycleSynchronize;

//class Task {
//	public static synchronized void printNumbers() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Printing : " + i + "[" + Thread.currentThread().getName() + "]");
//		}
//	}
//}
//
//class PrinterThread extends Thread {
//// Task task; / / PrinterThread(Task _task) { / this.task = _task; / }
//
//	@Override
//	public void run() {
//		Task.printNumbers();
//	}
//}
//
//class ThreadSystem {
//
//	public static void main(String[] args) {
//		// Task task1 = new Task();
//		PrinterThread t1 = new PrinterThread();
//		t1.setName("1stThread");
//		t1.start();
//
//		// Task task2 = new Task();
//
//		PrinterThread t2 = new PrinterThread();
//		t2.setName("2ndThread");
//		t2.start();
//	}
//
//}

// package com.Kodewala.Thread2LifeCycleSynchronize;

class Task {
	public synchronized void printNumbers() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Printing : " + i + "[" + Thread.currentThread().getName() + "]");
		}
	}
}

class PrinterThread extends Thread {
	Task task;

	PrinterThread(Task _task) {
		this.task = _task;
	}

	@Override
	public void run() {
		task.printNumbers();
	}
}

class ThreadSystem {

	public static void main(String[] args) {
		
		Task task1 = new Task();
		
		PrinterThread t1 = new PrinterThread(task1);
		t1.setName("1stThread");
		t1.start();

		Task task2 = new Task();

		PrinterThread t2 = new PrinterThread(task2);
		t2.setName("2ndThread");
		t2.start();
	}

}
