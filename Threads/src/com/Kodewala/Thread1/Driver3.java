package com.Kodewala.Thread1;

class EmailSender extends Thread {
	@Override
	public void run() {
		// When Thread is in running State --->
		// Thread is doing work / Task
		// From Running to Waiting / blocked
		// once waiting is over thread move to RUNNABLE state
		// Once CPU allows . thread move to RUNNING state
		// once run method is completed by thread , the it moves to Terminated(Dead)
		// state
		System.out.println("Sending Email ....." + Thread.currentThread().getName());
	}
}

class Driver3 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		// Once Thread object is created , State = New
		EmailSender t1 = new EmailSender();
		
		// State = RUNNABLE
		t1.start(); // New --> RUNN
		//t1.start(); // Terminated --> X

		// Once CPU gives time to execute/run then state will be RUNNING
	}

}
