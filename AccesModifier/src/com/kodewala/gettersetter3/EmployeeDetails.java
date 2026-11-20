package com.kodewala.gettersetter3;

class EmployeeDetails {
	private int employeeId;
	private String name;
	private double salary;
	private String department;
	private String email;

	public EmployeeDetails(int employeeId, String name, double salary, String department, String email) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.email = email;
	}

	// Getters
	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	public String getEmail() {
		return email;
	}

	public void changeEmployeeName(String newName) {

		if (newName != null && !newName.isBlank()) {

			name = newName;

			System.out.println("Employee name updated successfully.");

		} else {

			System.out.println("Invalid employee name.");

		}

	}

	public void applyAnnualHike(double percentage) {

		if (percentage > 0) {

			salary = salary + (salary * percentage / 100);

			System.out.println("Annual hike applied successfully.");

		} else {

			System.out.println("Invalid hike percentage.");

		}

	}

	public void changeDepartment(String newDepartment) {

		if (newDepartment != null && !newDepartment.isBlank()) {

			department = newDepartment;

			System.out.println("Department changed successfully.");

		} else {

			System.out.println("Invalid department.");

		}

	}

	public void updateEmail(String newEmail) {

		if (newEmail != null && newEmail.contains("@")) {

			email = newEmail;

			System.out.println("Email updated successfully.");

		} else {

			System.out.println("Invalid email address.");

		}

	}

	// ==============================
	// Display Method
	// ==============================

	public void displayEmployeeDetails() {

		System.out.println("\n========== Employee Details ==========");

		System.out.println("Employee Id   : " + employeeId);
		System.out.println("Name          : " + name);
		System.out.println("Salary        : " + salary);
		System.out.println("Department    : " + department);
		System.out.println("Email         : " + email);

	}
}
