package com.kodewala.aaisgnment;

class Reseller extends OrderSystem{

	@Override
    public void placeOrder() {
        System.out.println("Reseller placed a bulk order.");
    }

    @Override
    public void editOrder() {
        System.out.println("Reseller updated quantity of products.");
    }

    @Override
    public void confirmOrder() {
        System.out.println("Reseller order confirmed with GST invoice.");
    }

}
