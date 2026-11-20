package com.kodewala.exceptionEmpLogin;

public class Driver {

	public static void main(String[] args) throws Exception {
		EmpLogin employee = new EmpLogin();
		try {

			employee.login("sachin@gmail.com", "admin2565");

		} catch (Exception e) {

			System.out.println("Login Failed : " + e.getMessage());

		} finally {

			System.out.println("Application Closed.");

		} 
	}

}
