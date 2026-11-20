package com.Kodewala.Executer.service.Thread1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread {
	int taskId;

	public MyThread(int taskId) {
		this.taskId = taskId;
	}

	@Override
	public void run() {
		System.out.println("My Thread.run().... task is " + taskId + " : [" + Thread.currentThread().getName() + "]");
	}

}

class Driver {

	public static void main(String[] args) {
		// we are going to use executer service.
		
		ExecutorService executerService = Executors.newFixedThreadPool(5);

		// Executing 10 task
		for (int i = 0; i < 10; i++) {
			MyThread task = new MyThread(i);
			executerService.execute(task);
		}
		executerService.shutdown();
	}

}
