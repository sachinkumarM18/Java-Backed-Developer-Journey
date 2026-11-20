package com.kodewala.exception4;

class User {

	private static final String userName = "Sachin";

	public void createUser(String name, String password) {

		String userId = "";

		try {

			String country = "India";
			System.out.println("User.createUser() Started");
			System.out.println("Country : " + country);

			// This line will throw NullPointerException
			userId = userName.substring(0, 5) + "123";

			System.out.println("Generated User Id : " + userId);

		} catch (NullPointerException e) {

			System.out.println("User name is null.");
			e.printStackTrace();

		} catch (Exception e) {

			System.out.println("Something went wrong.");
			e.printStackTrace();

		} finally {

			System.out.println("Closing database connection...");

		}

		System.out.println("User.createUser() End");
	}
}
