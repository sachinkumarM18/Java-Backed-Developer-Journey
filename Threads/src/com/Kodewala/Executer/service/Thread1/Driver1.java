package com.Kodewala.Executer.service.Thread1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread1 implements Callable<Integer> {

	@Override
	public Integer call() { 
		return 20;
	}
}

class Driver1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(1);
		Future<Integer> future = es.submit(new MyThread1());
		System.out.println("Result : " + future.get());
	}

}
