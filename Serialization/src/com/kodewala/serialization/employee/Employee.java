package com.kodewala.serialization.employee;

import java.io.Serializable;

public class Employee implements Serializable {
	// private static final long serialVersion = 1L;
	private static final long serialVersionUID = 1L;
	private int employeeId;
	private String emoloyeeName;
	private double salary;
	private String password;

	public Employee(int employeeId, String emoloyeeName, double salary, String password) {
		super();
		this.employeeId = employeeId;
		this.emoloyeeName = emoloyeeName;
		this.salary = salary;
		this.password = password;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmoloyeeName() {
		return emoloyeeName;
	}

	public double getSalary() {
		return salary;
	}

	public String getPassword() {
		return password;
	}

}
