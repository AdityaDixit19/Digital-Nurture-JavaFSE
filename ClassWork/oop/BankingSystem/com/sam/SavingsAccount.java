package com.sam;
public class SavingsAccount extends BankAccount {
    private double intrestRate;

    public SavingsAccount(int accountNumber, String customerName, double Balance, double intrestRate) {
        super(accountNumber, customerName, Balance);
        this.intrestRate = intrestRate;
    }

    void displayAccountInfo() {
        System.out.println("\n Savings Account");
        System.out.println("Account no:" + this.getAccountNumber());
        System.out.println("customer name:" + this.getCustomerName());
        System.out.println("Balance:" + this.getbalance());
        System.out.println("IntrestRate:" + this.intrestRate + "%");
    }
}
