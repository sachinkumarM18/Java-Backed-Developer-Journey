package com.sachin.superr.constructor.object.HospitalMgnt;

public class Patient {
	protected String patientId;
	protected String patientName;
	protected int age;
	
	public static int counter = 5000;
	public Patient(String patientName, int age) {
		counter++;
		super();
		this.patientId = "PAT" + counter ;
		this.patientName = patientName;
		this.age = age;
		
		//System.out.println("This is Constructor Part 1");
	}
	
	public void displayPatient() {
		System.out.println("Patient Id : " +patientId);
		System.out.println("Patient Name : " + patientName);
		System.out.println("Patient Age : " + age);
	}
}
