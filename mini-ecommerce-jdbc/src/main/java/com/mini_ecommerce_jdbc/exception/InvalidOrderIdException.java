package com.mini_ecommerce_jdbc.exception;

public class InvalidOrderIdException extends RuntimeException {
	public InvalidOrderIdException(String message) {
		super(message);
	}
}
