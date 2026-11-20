package com.mini_ecommerce_jdbc.exception;

public class PasswordNotFoundException extends RuntimeException {
	public PasswordNotFoundException(String message) {
		super(message);
	}
}
