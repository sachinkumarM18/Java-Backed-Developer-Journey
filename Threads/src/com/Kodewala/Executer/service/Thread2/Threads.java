package com.Kodewala.Executer.service.Thread2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<Boolean> {
	EmailSender emailSender;

	public Task(EmailSender emailSender) {
		super();
		this.emailSender = emailSender;
	}

	@Override
	public Boolean call() throws Exception {
		System.out.println("Executing Call....");
		return emailSender.sendEmail(emailSender.email, emailSender.body);
	}

}

public class Threads {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("Main Thread Start..");

		//ExecutorService ex = Executors.newFixedThreadPool(5);
		ExecutorService ex = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 200; i++) {
			EmailSender emailSender = new EmailSender("Kodewala@gmail.com_" + i, "This is email body" + i);
			Task task = new Task(emailSender);

			Future<Boolean> future = ex.submit(task);
			//System.out.println("email status is : " + future.get());
		}
		System.out.println(" Main - END");

	}

}
