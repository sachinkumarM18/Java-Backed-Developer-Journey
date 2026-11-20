package com.mini_ecommerce_jdbc.exception;

public class InvalidCustomerIdException extends RuntimeException {
	public InvalidCustomerIdException(String message) {
		super(message);
	}
}
