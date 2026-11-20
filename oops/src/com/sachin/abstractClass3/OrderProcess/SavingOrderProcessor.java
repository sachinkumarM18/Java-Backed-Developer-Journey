package com.sachin.abstractClass3.OrderProcess;


public class SavingOrderProcessor extends OrderProcessor {

    // Child field
    private double taxRate = 5.0;

    public SavingOrderProcessor(
            String orderId,
            double amount) {

        super(orderId, amount);

        System.out.println(
                "SavingOrderProcessor constructor"
        );
    }

    @Override
    protected void calculateAmount() {

        double tax =
                getAmount() * taxRate / 100;

        updateAmount(getAmount() + tax);

        System.out.println(
                "Tax added: " + tax
        );
    }

    @Override
    protected void applyDiscount() {

        double discount =
                getAmount() * 0.10;

        updateAmount(
                getAmount() - discount
        );

        System.out.println(
                "10% discount applied"
        );
    }
}
