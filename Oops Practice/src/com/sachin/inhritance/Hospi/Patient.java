package com.sachin.inhritance.Hospi;

 class Patient {
	protected int patientId;
	protected String patientName;
	protected double consultationFee;
	
	public Patient(int patientId, String patientName , double consultationFee) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.consultationFee = consultationFee;
	}
	
	
	
	double calculateFinalFee() {
		return consultationFee;
	}
	
	void displayDetails() {
		System.out.println("<---------Patient Details ------->");
		System.out.println("Patient Id is :" + patientId);
		System.out.println("Patient Name is :" + patientName);
		System.out.println("Consultation Fee is :" + consultationFee);
	}
}
