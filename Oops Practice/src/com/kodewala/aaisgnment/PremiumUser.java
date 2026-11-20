package com.kodewala.aaisgnment;

class PremiumUser extends OrderSystem{

	@Override
    public void placeOrder() {
        System.out.println("Premium User placed an order with priority shipping.");
    }

    @Override
    public void editOrder() {
        System.out.println("Premium User modified delivery slot.");
    }

    @Override
    public void confirmOrder() {
        System.out.println("Premium User order confirmed with free insurance.");
    }

}
