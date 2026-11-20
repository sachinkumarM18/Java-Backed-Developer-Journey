package com.mini_ecommerce_jdbc.exception;

public class InsufficientStockException extends RuntimeException {
	public InsufficientStockException(String message) {
		super(message);
	}
}
