package com.kodewala.serialization.mobile;

import java.io.Serializable;

public class Mobile implements Serializable {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	private static  final long serialVersisonUID = 1L;
	
	private int imeiNumber;
	private String brandl; 
	private String model;
	private double price;
	private int unlockPin;
	
	public Mobile(int imeiNumber, String brandl, String model, double price, int unlockPin) {
		super();
		this.imeiNumber = imeiNumber;
		this.brandl = brandl;
		this.model = model;
		this.price = price; 
		this.unlockPin = unlockPin;
	}

	public long getImeiNumber() {
		return imeiNumber;
	}

	public String getBrandl() {
		return brandl;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public int getUnlockPin() {
		return unlockPin;
	}

	
	
	
}
