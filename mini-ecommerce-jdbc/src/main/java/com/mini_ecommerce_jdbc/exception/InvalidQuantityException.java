package com.mini_ecommerce_jdbc.exception;

public class InvalidQuantityException extends RuntimeException {
	public InvalidQuantityException(String message) {
		super(message);
	}
}
