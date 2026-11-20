package com.sachin.inheritance2;

public class Driver {

	public static void main(String[] args) {
		SeniorDeliveryAgen agent = new SeniorDeliveryAgen("Rahul", "Bangalore", 1500);
		agent.showAgentDetails();
		agent.deliverOrder();
	}

}
