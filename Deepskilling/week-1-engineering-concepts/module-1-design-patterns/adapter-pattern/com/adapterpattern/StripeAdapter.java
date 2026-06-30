package com.adapterpattern;

public class StripeAdapter implements PaymentProcessor {
    private final LegacyStripeGateway stripeGateway;

    public StripeAdapter(LegacyStripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Translate the standard processPayment call into the legacy method
        double amountInCents = amount * 100;
        stripeGateway.makePayment(amountInCents);
    }
}
