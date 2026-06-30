package com.adapterpattern;
public class AdapterTest {
    public static void main(String[] args) {
        LegacyStripeGateway oldStripe = new LegacyStripeGateway();
        PaymentProcessor processor = new StripeAdapter(oldStripe);

        // The client only knows about processPayment, not makePayment
        processor.processPayment(50.00);
    }
}
