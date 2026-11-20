package com.kodewala.aaisgnment;

class RetailUser extends OrderSystem{

	@Override
    public void placeOrder() {
        System.out.println("Retail User placed a single product order.");
    }

    @Override
    public void editOrder() {
        System.out.println("Retail User updated delivery address.");
    }

    @Override
    public void confirmOrder() {
        System.out.println("Retail User order confirmed.");
    }

}
