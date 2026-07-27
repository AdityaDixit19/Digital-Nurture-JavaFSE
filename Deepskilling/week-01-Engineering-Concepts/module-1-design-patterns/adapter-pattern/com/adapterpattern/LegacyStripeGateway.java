package com.adapterpattern;

public class LegacyStripeGateway {
    public void makePayment(double amountInCents) {
        System.out.println("Stripe: Processing payment of " + amountInCents + " cents.");
    }
}
