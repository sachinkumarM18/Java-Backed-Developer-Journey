package com.sachin.superr.constructor.object.HospitalMgnt;

public class Driver {

	public static void main(String[] args) {
		InPatient patient1 = new InPatient("Amit Sah", 72, 101, "Dr. Rajesh Khanna", 99999999.36);
		InPatient patient2 = new InPatient("Narendra Modi", 76, 102, "Dr. Jhatka", 28655522);
		patient1.displayPatientDetails();
		patient2.displayPatientDetails();
	}

}
