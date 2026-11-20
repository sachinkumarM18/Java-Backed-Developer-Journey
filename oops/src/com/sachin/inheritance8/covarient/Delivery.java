package com.sachin.inheritance8.covarient;

class Delivery {
	public Post doDeliver() {
		System.out.println("Do Delivery");
		return new Post();
	}
	
}
class doDelivery extends Delivery{
	@Override
	public speedPost doDeliver() {
		System.out.println("Do smart Delivery");
		return new speedPost();
	}
}
