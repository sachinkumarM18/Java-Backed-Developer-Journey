package com.kodewala.gettersetter3;

public class Driver {

	public static void main(String[] args) {
		EmployeeDetails employee = new EmployeeDetails(131, "Rohit", 45000, "Java Backend Developer",
				"sachin@gmail.com");
		employee.displayEmployeeDetails();

		System.out.println();

		employee.changeEmployeeName("Sachin K.");

		employee.applyAnnualHike(15);

		employee.changeDepartment("Architecture Team");

		employee.updateEmail("sachin@company.com");

		employee.displayEmployeeDetails();
	}

}
