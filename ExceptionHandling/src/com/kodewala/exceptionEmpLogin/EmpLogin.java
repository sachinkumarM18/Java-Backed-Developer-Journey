package com.kodewala.exceptionEmpLogin;

class EmpLogin {

	public void login(String emailId, String password) throws Exception {

		try {
			if (emailId == null) {
				throw new Exception("Email canot be null");
			}

			if (password == null) {
				throw new Exception("password Canot be null");
			}

			if (password.length() < 8) {
				throw new Exception("Password Must Contain at least 8 Character.");
			}

			System.out.println("Employee Login Successful");

		} finally {
			System.out.println("Closing Database Connection");
		}
	}
}
