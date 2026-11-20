package com.kodewala.excepCheckUncheck;

import java.io.FileInputStream;
import java.io.IOException;

class EmployeeRegistration {

	public void registerEmployee(String name, String email, double salary, String documentPath)
			throws IOException {

		try {

			// Validation 1
			if (name == null) {
				throw new IllegalArgumentException("Employee name cannot be null.");
			}

			// Validation 2
			if (email == null) {
				throw new IllegalArgumentException("Employee email cannot be null.");
			}

			// Validation 3
			if (salary <= 0) {
				throw new IllegalArgumentException("Salary must be greater than 0.");
			}

			// Validation 4
			if (salary > 2000000) {
				throw new IllegalArgumentException("Salary exceeds company policy.");
			}

			// Checked Exception
			FileInputStream fis = new FileInputStream(documentPath);

			System.out.println("Employee Registered Successfully.");

			fis.close();

		} finally {

			System.out.println("Closing Employee Database Connection...");

		}
	}
}