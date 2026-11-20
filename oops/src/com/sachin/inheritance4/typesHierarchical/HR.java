package com.sachin.inheritance4.typesHierarchical;

class HR extends Employee {

	// HR-specific data
	private int employeesHired;
	private String recruitmentType;

	// HR constructor
	public HR(int employeeId, String employeeName, String department, double salary, int employeesHired,
			String recruitmentType) {

		// Calling parent constructor
		super(employeeId, employeeName, department, salary);

		this.employeesHired = employeesHired;
		this.recruitmentType = recruitmentType;
	}

	// HR-specific method
	public void displayHRDetails() {

		System.out.println("Employees Hired  : " + employeesHired);

		System.out.println("Recruitment Type  : " + recruitmentType);

		System.out.println("Department        : " + department);

		System.out.println("Salary            : " + salary);
	}

	// HR-specific method
	public void conductInterview() {

		System.out.println("HR is conducting technical " + "and HR interviews.");
	}

	// HR-specific method
	public void generateOfferLetter() {

		System.out.println("Offer letter generated successfully.");
	}
}