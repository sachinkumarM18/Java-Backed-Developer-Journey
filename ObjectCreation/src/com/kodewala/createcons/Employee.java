package com.kodewala.createcons;

public class Employee {
	private String employeeName;
	private String employeeId;
	private String department;
	private double salary;

	Employee(String employeeName, String employeeId, String department, double salary) {
		System.out.println("Object initialized");
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.department = department;
		this.salary = salary;

	}

	public static void main(String[] args) {
		Employee emp = new Employee("Sachin", "22cs131", "Java Dveloper", 6636663);
		emp.displayDetails();
	}

	public void displayDetails() {
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee Id : " + employeeId);
		System.out.println("Employee Department : " + department);
		System.out.println("Employee Salary : " + salary);
	}
}
