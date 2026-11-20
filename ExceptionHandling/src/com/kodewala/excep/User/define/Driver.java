package com.kodewala.excep.User.define;

public class Driver {

	public static void main(String[] args) {
		Registration registration = new Registration();

		try {
			registration.doRegistration("sachin12355");
		} catch (UserAlreadyExistsException e) {
			e.printStackTrace();
		}
	}

}
