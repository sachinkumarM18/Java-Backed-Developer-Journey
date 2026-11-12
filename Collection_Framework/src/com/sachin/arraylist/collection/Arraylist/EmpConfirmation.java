package com.sachin.arraylist.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class EmpConfirmation {

	public static void main(String[] args) {
		List<String> employees = new ArrayList<>();
		employees.add("EMP101");
		employees.add("EMP102");
		employees.add("EMP103");
		employees.add("EMP104");
		employees.add("EMP105");

		System.out.println("Checking Employee Confirmation.......");

		for (String employeeId : employees) {
			System.out.println("Employee " + employeeId + " is Active");
		}
	}

}
