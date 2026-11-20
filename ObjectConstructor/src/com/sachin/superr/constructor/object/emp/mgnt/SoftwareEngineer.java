package com.sachin.superr.constructor.object.emp.mgnt;

public class SoftwareEngineer extends Employee {
	private String technology;
	private int experience;

	public SoftwareEngineer(String employeeId, String employeeName, String technology, int experience) {
		super(employeeId, employeeName);
		this.technology = technology;
		this.experience = experience;

		System.out.println("Software Engineer COnstructor");
	}

	public void display() {
		displayEmployee();
		System.out.println("Technology : " + technology);
		System.out.println("Experience : " + experience);
	}
}
