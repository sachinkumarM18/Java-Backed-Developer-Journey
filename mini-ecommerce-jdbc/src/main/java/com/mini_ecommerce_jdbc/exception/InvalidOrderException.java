package com.mini_ecommerce_jdbc.exception;

public class InvalidOrderException extends RuntimeException {
	public InvalidOrderException(String message) {
		super(message);
	}
}
