package com.sachin.inheritance4.typesHierarchical;

class Employee {

	// private → accessible only inside Employee
	private int employeeId;
	private String employeeName;

	// protected → accessible inside Employee and child classes
	protected String department;
	protected double salary;

	// default → accessible within the same package
	String companyName = "Tech Solutions";

	// Parent constructor
	public Employee(int employeeId, String employeeName, String department, double salary) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;
	}

	// Public method → inherited by child classes
	public void displayEmployeeDetails() {

		System.out.println("Employee ID   : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Department    : " + department);
		System.out.println("Salary        : " + salary);
		System.out.println("Company       : " + companyName);
	}

	// Protected method → accessible inside child classes
	protected void calculateAnnualSalary() {

		double annualSalary = salary * 12;

		System.out.println("Annual Salary : " + annualSalary);
	}

	// Default method → accessible within same package
	void companyPolicy() {

		System.out.println("Employee must follow company policies.");
	}
}