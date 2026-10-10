package com.sachin.Abstract.Classses2.OrderManagement;

public abstract class OrderManagement {
	
	
	public OrderManagement() {
		super();
	}


	abstract void placeOrder();

	abstract void editOrder();

	abstract void confirmOrder();

	void orderStatus() {
		System.out.println("Pending");
	}
	
	
}

class Retails extends OrderManagement {

	@Override
	void placeOrder() {
		System.out.println("Order are getting Placed");
	}

	@Override
	void editOrder() {
		System.out.println("Edit your Order");
	}

	@Override
	void confirmOrder() {
		System.out.println("Your Order has been Pending");
	}
	
	@Override 
	void orderStatus() {
		System.out.println("your order is now running late");
	}
}

class Premium extends OrderManagement {

	@Override
	void placeOrder() {
		System.out.println("You have Order With Premium Account");
	}

	@Override
	void editOrder() {
		System.out.println("Edit your Order during Delivery Time ");
	}

	@Override
	void confirmOrder() {
		System.out.println("Your Order has been Confirm");
	}
	
	@Override 
	void orderStatus() {
		System.out.println("Delivery on Time");
	}
}

class Resellers extends OrderManagement {

	@Override
	void placeOrder() {
		System.out.println("Your Order has been Placed");

	}

	@Override
	void editOrder() {
		System.out.println("Marks as your Order must be Deliver");
	}

	@Override
	void confirmOrder() {
		System.out.println("its your badluck we are  not Delivering Your Items");
	}
	
	@Override 
	void orderStatus() {
		System.out.println("Out for Delivery");
	}
}