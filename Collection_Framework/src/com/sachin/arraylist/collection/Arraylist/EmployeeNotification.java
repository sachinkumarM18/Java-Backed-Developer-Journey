package com.sachin.arraylist.collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class EmployeeNotification {

	public static void main(String[] args) {
		List<String> employees = new ArrayList<>();
		employees.add("EMP101");
		employees.add("EMP102");
		employees.add("EMP103");
		employees.add("EMP104");

		System.out.println("Sending Notification");

//		employees.forEach(employeeId -> {
//			System.out.println("Notifaication Sent to Employee : " + employeeId);
//		});
		for (String emp : employees) {
			System.out.println("Notifaication Sent to Employee : " + emp);
		}
	}

}
