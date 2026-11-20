package com.mini_ecommerce_jdbc.exception;

public class DatabaseOperationException extends RuntimeException {
	public DatabaseOperationException(String message) {
		super(message);
	}
}
