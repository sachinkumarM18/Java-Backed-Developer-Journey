package com.sachin.Interface1.HospitalManagement;

public class Surgeon implements MedicalStaff {

	@Override
	public void attendPatient() {
		System.out.println("Surgeon is Preparing the patient for surgery.");
	}

	@Override
	public void completeDuty() {
		System.out.println("Surgeon has Completed the duty.");
	}

	@Override
	public void displayStaffInfo() {
		System.out.println("\n--- Surgeon Information ---");
		System.out.println("Role :      Surgeon");
		System.out.println("Department  : General Surgery");

	}
}
