package com.sachin.Interface1.HospitalManagement;

public interface MedicalStaff {
	// Abstract Method
	// Every medical staff member must define
	// how they attend a patient.
	void attendPatient();

	void completeDuty();

	// Default method
	// Common behaviour for all medical staff

	default void displayStaffInfo() {
		System.out.println("Medical Staff Member ");
		System.out.println("Hospital duty is active.");
	}

	// Default method using private methods
	default void prepareForDuty() {
		System.out.println("\nPreparing for Duty...");
		checkUniform();
		checkEquipment();
		verifyAttendance();
	}

	// Static Method
	// Utility method related to MedicalStaff.
	// It belongs to the interface itself.

	static boolean isValidStaffId(int staffId) {
		return staffId >= 1000 && staffId <= 9999;

	}

	// Private Methods
	// These are internal helper methods.
	// They cannot be called directly by implementing classes.

	private void checkUniform() {
		System.out.println("Uniform Checked.");
	}

	private void checkEquipment() {
		System.out.println("Medical equipment Checked.");
	}

	private void verifyAttendance() {
		System.out.println("Attedence Verified");
	}
}
