package com.mini_ecommerce_jdbc.model;

public class Customer {
	private int customerId;
	private String customerName;
	private String email;
	private String mobile;
	private String address;
	private String password;

	public Customer(int customerId, String customerName, String email, String mobile, String address, String password) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.mobile = mobile;
		this.address = address; 
		this.password = password;
	}

	public int getCustomerId() {
		return customerId; 
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public String getAddress() {
		return address;
	}

	public String getPassword() {
		return password;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
				+ ", mobile=" + mobile + ", address=" + address + "]";
	}

}
