package com.sachin.string1;

public class Demo1 {

	public static void main(String[] args) {
		
		//String s1 = "Sachin";
		//s1 = s1.concat(" Kumar");
		//System.out.println(s1.toLowerCase());
		
		// Trim
		//String email = "                   sachin@gmail.com   ";
		//System.out.println(email.trim());
		
		// employee
//		String employeeId = "EMP45896";
//		System.out.println(employeeId.charAt(0));
//		System.out.println((employeeId.charAt(employeeId.length()-1)));
//		System.out.println(employeeId.length());
		
		// Password Policy
		
//		String password = "kjds54";  // Check password empty or not
//		if(password == "") {
//			System.out.println("Password Must Enter");
//		}
//		else if(password.length() >=8) {
//			System.out.println("Correct Password");
//		}else {
//			System.out.println("invalid Password");
//		}
		
//		String customerName = "";
//		if(customerName.isBlank()) {
//			System.out.println("Mandatory to Enter Coustomer Name");
//		}
		
		String invoiceNo = "INV-2026-1002588";
		char prefix = invoiceNo.charAt(0);
		System.out.println(prefix);
	}

}
