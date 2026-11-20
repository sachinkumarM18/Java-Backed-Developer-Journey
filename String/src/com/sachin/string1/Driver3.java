package com.sachin.string1;

public class Driver3 {

	public static void main(String[] args) {
		/*
		 * String s1 = "Backend"; String s2 = "Rajnish";
		 * 
		 * System.out.println(s1.hashCode()); System.out.println(s2.hashCode());
		 */

		/*
		 * String s1 = new String("Java"); String s2 = s1.intern();
		 * System.out.println(s2 == "Java");
		 */

		/*
		 * String employeeName = "Sachin"; String managerName = employeeName;
		 * 
		 * System.out.println(employeeName); System.out.println(managerName);
		 */

		String employeeName = "vikash";
		String managerName = employeeName;
		employeeName = "Akash";
		System.out.println(employeeName); // Akash
		System.out.println(managerName);  // Vikash
	}
}
