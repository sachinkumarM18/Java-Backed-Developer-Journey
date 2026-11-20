package com.mini_ecommerce_jdbc.exception;

public class CategoryNotFoundException extends RuntimeException {
	public CategoryNotFoundException(String message) {
		super(message); 
	}
}
