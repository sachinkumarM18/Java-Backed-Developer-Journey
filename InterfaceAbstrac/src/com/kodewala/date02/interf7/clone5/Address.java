package com.kodewala.date02.interf7.clone5;

class Address {
	private String city;
	private String state;

	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	public void displayAddress() {
		System.out.println("City : " + city);
		System.out.println("State : " + state);

	}
}
