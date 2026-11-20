package com.kodewala.excep.User.define;

public class UserAlreadyExistsException extends Exception {
	public UserAlreadyExistsException(String _message) {
		super(_message);
	}
}
