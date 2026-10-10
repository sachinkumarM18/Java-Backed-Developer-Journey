package com.sachin.Interface1.HospitalManagement;

public class Doctor implements MedicalStaff {

	@Override
	public void attendPatient() {
		System.out.println("Doctor is diagnosing the patient.");
	}

	@Override
	public void completeDuty() {
		System.out.println("Doctor completed the duty.");
	}

	// Override the default method because
	// Doctors need more specific information.

	@Override
	public void displayStaffInfo() {
		System.out.println("\n--- Doctor Information ---");
		System.out.println("Role     : Doctor");
		System.out.println("Department : Cardiology");
	}
}
