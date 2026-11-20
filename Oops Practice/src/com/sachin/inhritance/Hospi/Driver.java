package com.sachin.inhritance.Hospi;

public class Driver {

	public static void main(String[] args) {
		Patient[] patients = { new InPatient(101, "Narendra Modi", 500000, 20, 10),
				new EmergencyPatient(103, "Amit Sah", 400000, 102, "Top"), };

		for (

		Patient patient : patients) {
			patient.displayDetails();
			System.out.println();
		}
	};

};
