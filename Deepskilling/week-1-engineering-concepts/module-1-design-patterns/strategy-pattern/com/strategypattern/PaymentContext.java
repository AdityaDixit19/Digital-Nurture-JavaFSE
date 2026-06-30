package com.strategypattern;

public class PaymentContext {
    private PaymentStrategy strategy;

    // The strategy can be swapped at runtime
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        if (strategy == null) throw new IllegalStateException("Payment strategy not set!");
        strategy.pay(amount);
    }
}