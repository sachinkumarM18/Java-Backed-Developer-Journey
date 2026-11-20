package com.Kodewala.Executer.service.Thread2;

class EmailSender {
	String email;
	String body;

	public EmailSender(String email, String body) {
		super();
		this.email = email;
		this.body = body;
	}

	public boolean sendEmail(String _email, String body) {
		System.out.println("Sending email " + _email + "[" + Thread.currentThread().getName() + "]");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
}
