package com.mini_ecommerce_jdbc.exception;

public class InvalidEmailException extends RuntimeException {
	public InvalidEmailException(String message) {
		super(message);
	}
}
