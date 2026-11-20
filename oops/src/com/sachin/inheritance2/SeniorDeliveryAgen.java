package com.sachin.inheritance2;

class SeniorDeliveryAgen extends DeliveryAgent {
	private double bonus;

	public SeniorDeliveryAgen(String agentName, String location, double bonus) {
		super(agentName, location);
		this.bonus = bonus;

		System.out.println("SeniorDeliveryAgent Constructor");
	}

	@Override
	public void deliverOrder() {
		System.out.println("Senior Agent Started delivery");
		super.deliverOrder();
		System.out.println("Senior agent gets priority delivery bonus");
	}
}
