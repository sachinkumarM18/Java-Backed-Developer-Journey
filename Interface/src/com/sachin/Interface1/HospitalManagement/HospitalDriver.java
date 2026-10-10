package com.sachin.Interface1.HospitalManagement;

public class HospitalDriver {

	public static void main(String[] args) {
		// Doctor
		MedicalStaff doctor = new Doctor();
		doctor.displayStaffInfo();
		doctor.prepareForDuty();
		doctor.attendPatient();
		doctor.completeDuty();

		System.out.println("\n==============================");
		// Nurse
		MedicalStaff nurse = new Nurse();
		nurse.displayStaffInfo();
		nurse.displayStaffInfo();
		nurse.attendPatient();
		nurse.completeDuty();

		System.out.println("\n==============================");
		
		// Surgeon
		MedicalStaff surgeon = new Surgeon();
		surgeon.displayStaffInfo();
		surgeon.displayStaffInfo();
		surgeon.attendPatient();
		surgeon.completeDuty();

		// Static Method
		System.out.println("\n==============================");
		int staffId = 2852;
		if (MedicalStaff.isValidStaffId(staffId)) {
			System.out.println("StaffId : " + staffId + " is Valid.");
		} else {
			System.out.println("StaffId : " + staffId + " is Invalid");
		}
	}

}
