package com.mini_ecommerce_jdbc.exception;

public class EmailNotFoundException extends RuntimeException {
	public EmailNotFoundException(String message) {
		super(message);
	}
}
