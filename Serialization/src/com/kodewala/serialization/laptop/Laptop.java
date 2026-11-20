package com.kodewala.serialization.laptop;

import java.io.Serializable;

public class Laptop implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int serialNumber;
	private String brand;
	private double price;
	private String password;
	
	public Laptop(int serialNumber, String brand, double price, String password) {
		super();
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.price = price;
		this.password = password;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	public String getBrand() {
		return brand;
	}
	public double getPrice() {
		return price;
	}
	public String getPassword() {
		return password;
	}
	
	
}
