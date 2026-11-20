package com.sachin.superr.constructor.object.HospitalMgnt;

public class InPatient extends Patient {
	private int roomNumber;
	private String doctorName;
	private double totalBill;

	public InPatient(String patientName, int age, int roomNumber, String doctorName,
			double totalBill) {

		super(patientName, age);
		this.roomNumber = roomNumber;
		this.doctorName = doctorName;
		this.totalBill = totalBill;
		
		//System.out.println("Constructor Called 2");
	}

	public void displayPatientDetails() {
		System.out.println("\n--------------------------");
		displayPatient();
		System.out.println("Patient Room Number : " + roomNumber);
		System.out.println("Doctor Name : " + doctorName);
		System.out.println("Total BIll : " + totalBill);
	}
}
