package com.sachin.Interface1.HospitalManagement;

public class Nurse implements MedicalStaff {

	@Override
	public void attendPatient() {
		System.out.println("Nurse is taking care of the patient.");
	}

	@Override
	public void completeDuty() {
		System.out.println("Nurse Completed the duty.");
	}

	// we dont override displayStaffInfo().
	// Therefore Nurse will use the default
	// Implementation from medicalStaff.
}
