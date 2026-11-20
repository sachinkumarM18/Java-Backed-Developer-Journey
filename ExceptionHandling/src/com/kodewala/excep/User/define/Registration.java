package com.kodewala.excep.User.define;

class Registration {
	public boolean doRegistration(String _userId) throws UserAlreadyExistsException {
		boolean status = false;
		boolean isUserExists = true;
		// check the user id against database if not then insert the record
		// caller that user is already available in db.

		if (!isUserExists) {
			System.out.println("Registering the User : " + _userId);
			status = true;
		} else {
			// insert the record to database
			System.out.println("User is Available in Db... " + _userId);
			// inform caller --> Throwing user defined exception
			throw new UserAlreadyExistsException("User Already registered" + _userId);
		}
		return status;
	}
}
