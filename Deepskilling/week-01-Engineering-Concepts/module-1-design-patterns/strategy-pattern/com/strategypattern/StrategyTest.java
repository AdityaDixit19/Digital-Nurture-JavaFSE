package com.strategypattern;

public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext checkout = new PaymentContext();

        checkout.setPaymentStrategy(new PayPalPayment());
        checkout.executePayment(89.99);

        checkout.setPaymentStrategy(new CreditCardPayment());
        checkout.executePayment(250.00);
    }
}
