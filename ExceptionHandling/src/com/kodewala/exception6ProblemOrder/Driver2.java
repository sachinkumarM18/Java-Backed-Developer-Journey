package com.kodewala.exception6ProblemOrder;
class OrderService {

    public void placeOrder(String item, int qty) {

        try {

            if (qty <= 0) {
                throw new IllegalArgumentException("Quantity cannot be zero or negative.");
            }

            System.out.println("Order Placed Successfully");
            System.out.println("Item : " + item);
            System.out.println("Quantity : " + qty);

        } catch (IllegalArgumentException e) {

            System.out.println("Order Failed : " + e.getMessage());

        } finally {

            System.out.println("Thank you for visiting our E-Commerce Store.");
        }
    }
}

public class Driver2 {

    public static void main(String[] args) {

        OrderService order = new OrderService();

        order.placeOrder("Laptop", 2);

        System.out.println("----------------------");

        order.placeOrder("Mobile", -5);
    }
}