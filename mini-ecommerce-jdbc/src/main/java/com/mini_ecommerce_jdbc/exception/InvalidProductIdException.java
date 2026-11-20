package com.mini_ecommerce_jdbc.exception;

public class InvalidProductIdException extends RuntimeException {
	public InvalidProductIdException(String message) {
		super(message);
	}
}
