package com.sachin.string1;

public class EmployeeService {

	public static void main(String[] args) {
		String employeeId = "EMP1001";
		generateNewId(employeeId);
		System.out.println(employeeId);
	}

	public static void generateNewId(String employeeId) {
		employeeId = employeeId.replace("1001", "1002");
	}
}
