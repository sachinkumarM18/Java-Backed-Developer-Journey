package com.sachin.inheritance4.typesHierarchical;

public class Developer extends Employee {

	// Developer-specific data
	private String programmingLanguage;
	private int projectsCompleted;

	// Developer constructor
	public Developer(int employeeId, String employeeName, String department, double salary, String programmingLanguage,
			int projectsCompleted) {

		// Calling parent constructor
		super(employeeId, employeeName, department, salary);

		this.programmingLanguage = programmingLanguage;
		this.projectsCompleted = projectsCompleted;
	}

	// Developer-specific method
	public void displayDeveloperDetails() {

		System.out.println("Programming Language : " + programmingLanguage);

		System.out.println("Projects Completed   : " + projectsCompleted);

		System.out.println("Department            : " + department);

		System.out.println("Salary                : " + salary);
	}

	// Developer-specific method
	public void writeCode() {

		System.out.println("Developer is writing " + programmingLanguage + " code.");
	}

	// Developer-specific method
	public void calculateDeveloperBonus() {

		double bonus = salary * 0.10;

		System.out.println("Developer Bonus : " + bonus);
	}
}