package com.kodewala.cloning.shallow;

public class Address {
	String line1;

	public Address(String line1) {
		super();
		this.line1 = line1;
	}

	@Override
	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}
}
