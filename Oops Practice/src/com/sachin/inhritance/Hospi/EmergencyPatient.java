package com.sachin.inhritance.Hospi;

class EmergencyPatient extends Patient{
	int ambulanceNumber;
	String criticalLevel;
	public EmergencyPatient(int patientId, String patientName, double consultationFee,int ambulanceNumber,String criticalLevel) {
		super(patientId, patientName, consultationFee);
		this.ambulanceNumber = ambulanceNumber;
		this.criticalLevel = criticalLevel;
	}
	
	double calculateFinalFee(){
		return consultationFee;
	}
	
	@Override 
	void displayDetails() {
		super.displayDetails();
		
		System.out.println("Ambulance Number: " + ambulanceNumber);
		System.out.println("Condition Level of Patient : " + criticalLevel);
		System.out.println("<------------------->");
	}

}
