package com.mini_ecommerce_jdbc.exception;

public class DuplicateCustomerFoundException extends RuntimeException {
	public DuplicateCustomerFoundException(String message) {
		super(message);
	}
}
