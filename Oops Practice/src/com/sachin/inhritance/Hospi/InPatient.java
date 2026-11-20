package com.sachin.inhritance.Hospi;

class InPatient extends Patient{
	int roomNumber;
	int daysAdmitted;
	public InPatient(int patientId, String patientName, double consultationFee , int roomNumber , int daysAdmitted) {
		super(patientId, patientName, consultationFee);
		this.roomNumber = roomNumber;
		this.daysAdmitted = daysAdmitted;
	}
	
	double calculateFinalFee() {
		if(consultationFee >50000) {
			return consultationFee - (consultationFee * 0.15);
		}
		return consultationFee;
		
	}
	
	@Override
	void displayDetails() {
		super.displayDetails();
		
		System.out.println("Room NO : " + roomNumber);
		System.out.println("Total Days Admitted :" + daysAdmitted );
		System.out.println("<--------------->");
	}
}
