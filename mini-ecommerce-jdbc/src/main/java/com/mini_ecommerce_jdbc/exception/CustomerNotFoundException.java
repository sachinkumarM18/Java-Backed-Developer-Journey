package com.mini_ecommerce_jdbc.exception;

public class CustomerNotFoundException extends RuntimeException {
	public CustomerNotFoundException(String message) {  
		super(message);
	}
}
