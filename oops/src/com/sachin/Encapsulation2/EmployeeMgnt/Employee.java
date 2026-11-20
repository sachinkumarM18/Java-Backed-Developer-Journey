package com.sachin.Encapsulation2.EmployeeMgnt;

class Employee {
	private String employeeId;
	private String employeeName;
	private double salary;
	private String department;

	// Constructor
	public Employee(String employeeId, String employeeName, double salary, String department) {

		if (salary < 0) {
			System.out.println("Salary Must be Greater than Zero");
		}

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
	}

	// Salary Increment

	public void increseSalary(double percentage) {
		if (percentage <= 0) {
			System.out.println("Invalid Increment Percentage");
			return;
		}
		double incrementAmount = salary * percentage / 100;
		salary = salary + incrementAmount;
	}

	// Salary Deduction

	public void deductionSalary(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid deduction amount");
			return;
		}

		if (amount > salary) {
			System.out.println("Deduction can't be Greater than Salary");
			return;
		}
		;
		salary = salary - amount;
	}

	// Promotion

	public void promote(String newDepartment, double newSalary) {
		if (newDepartment == null || newDepartment.isBlank()) {
			System.out.println("Department Cant be Empty");
			return;
		}

		if (newSalary < salary) {
			System.out.println("New Salary cannot be Lower than current Salary");
			return;
		}

		department = newDepartment;
		salary = newSalary;
	}

	// Getters
	public String getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

}
