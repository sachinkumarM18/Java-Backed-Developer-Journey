package com.sachin.superr.constructor.object.emp.mgnt;

public class Employee {
	protected String employeeId;
	protected String employeeName;

	public Employee(String employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;

		System.out.println("Employee Constructor");
	}

	public void displayEmployee() {
		System.out.println("Employee Id : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
	}
}
