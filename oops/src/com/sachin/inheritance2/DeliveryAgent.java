package com.sachin.inheritance2;

class DeliveryAgent {
	protected String agentName;
	protected String location;

	public DeliveryAgent(String agentName, String location) {

		this.agentName = agentName;
		this.location = location;

		System.out.println("DeliveryAgent constructor");
	}

	public void deliverOrder() {
		System.out.println(agentName + " is Delivering the order");
	}

	public void showAgentDetails() {
		System.out.println("Agent Name : " + agentName);
		System.out.println("Location : " + location);
	}
}
