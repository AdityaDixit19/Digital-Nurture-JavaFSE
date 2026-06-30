package com.sam;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String customerName, double balance, double overdraftLimit) {
        super(accountNumber, customerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void displayAccountInfo() {
        System.out.println("\n Current Account");
        System.out.println("Account no:" + this.getAccountNumber());
        System.out.println("customer name:" + this.getCustomerName());
        System.out.println("Balance:" + this.getbalance());
        System.out.println("OverdraftLimit:" + this.overdraftLimit);
    }
}

