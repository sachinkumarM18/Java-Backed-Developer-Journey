package com.sachin.inheritance4.typesHierarchical;

class Tester extends Employee {

	// Tester-specific data
	private String testingTool;
	private int testCasesExecuted;

	// Tester constructor
	public Tester(int employeeId, String employeeName, String department, double salary, String testingTool,
			int testCasesExecuted) {

		// Calling parent constructor
		super(employeeId, employeeName, department, salary);

		this.testingTool = testingTool;
		this.testCasesExecuted = testCasesExecuted;
	}

	// Tester-specific method
	public void displayTesterDetails() {

		System.out.println("Testing Tool         : " + testingTool);

		System.out.println("Test Cases Executed  : " + testCasesExecuted);

		System.out.println("Department            : " + department);

		System.out.println("Salary                : " + salary);
	}

	// Tester-specific method
	public void executeTesting() {

		System.out.println("Tester is testing the application " + "using " + testingTool);
	}

	// Tester-specific method
	public void generateTestReport() {

		System.out.println("Test report generated successfully.");
	}
}