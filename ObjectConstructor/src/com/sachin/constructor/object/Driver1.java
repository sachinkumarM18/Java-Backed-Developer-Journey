package com.sachin.constructor.object;

class Employee {
	private String employeeId;
	private String employeeName;
	private String department;
	private double salary;

	// Static Variable (Common for all Objects)
	private static int counter = 1000;

	public Employee() {
	    this("Unknown", "Not Assigned", 0.0);
	}
	// Parameterized Constructor
	public Employee(String employeeName, String department, double salary) {
		counter++;
		this.employeeId = "EMP" + counter;
		this.employeeName = employeeName;
		this.department = department;
		this.salary = salary;

		System.out.println("Employee Created Successfully");
	}

	public void display() {
		System.out.println("-----------------------------");
		System.out.println("Employee ID   : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Department    : " + department);
		System.out.println("Salary        : " + salary);
	}
}

class Driver1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee("Sachin", "Java Baackend", 75000);
		Employee emp3 = new Employee("Rahul", "Devops", 68000);

		emp1.display();
		emp2.display();
		emp3.display();
	}

}
