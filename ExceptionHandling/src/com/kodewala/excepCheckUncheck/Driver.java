package com.kodewala.excepCheckUncheck;

import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) {

		EmployeeRegistration employee = new EmployeeRegistration();

		try {

			employee.registerEmployee("Sachin", "sachin@gmail.com", 50000, "Employee.txt");

		}

		catch (FileNotFoundException e) {

			System.out.println("File Not Found : " + e.getMessage());

		}

		catch (IllegalArgumentException e) {

			System.out.println("Validation Error : " + e.getMessage());

		}

		catch (Exception e) {

			System.out.println("Unexpected Error : " + e.getMessage());

		}

		finally {

			System.out.println("Application Closed.");

		}

	}

}