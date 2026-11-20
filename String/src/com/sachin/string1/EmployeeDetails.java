package com.sachin.string1;

public class EmployeeDetails {

	public static void main(String[] args) {
		String employeeCode = "EMP101";
		promote(employeeCode);
		System.out.println(employeeCode);
	}

	static void promote(String employeeCode) {
		employeeCode = employeeCode.replace("EMP", "MGR");
		verify(employeeCode);
	}

	static void verify(String emolyeeCode) {
		emolyeeCode = emolyeeCode.concat("-LEVEL");
	}
}
