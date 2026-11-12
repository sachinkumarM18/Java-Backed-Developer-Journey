package com.sachin.arraylist.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {

	public static void main(String[] args) {
		List<String> employeeId = new ArrayList<>();

		employeeId.add("EMP101");
		employeeId.add("EMP102");
		employeeId.add("EMP103");
		employeeId.add("EMP104");
		employeeId.add("EMP105");
		
//		int index = employeeId.indexOf("EMP103");
//		if(index != -1) {
//			employeeId.set(index, "EMP203");
//		}
		
		System.out.println(employeeId.contains("EMP103"));
		employeeId.set(2, "EMP203");
		System.out.println(employeeId.indexOf("EMP103"));
//		employeeId.remove("EMP104");
		System.out.println(employeeId);
//		System.out.println(employeeId.size());
	}

}
