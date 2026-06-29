package com.sam;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    public CurrentAccount(int accountNumber, String customerName, double balance,double overdraftLimit) {
        super(accountNumber,customerName,balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void displayAccountInfo(){
        System.out.println("\n Current Account");
        System.out.println("Account no:"+getAccountNumber());
        System.out.println("customer name:"+getCustomerName());
        System.out.println("Balance:"+getbalance());
        System.out.println("OverdraftLimit:"+overdraftLimit);
    }
}
