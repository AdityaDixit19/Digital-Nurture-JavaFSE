package com.sam;

abstract class BankAccount {
    private int accountNumber;
    private String customerName;
    private double balance;
    public BankAccount(int accountNumber, String customerName, double Balance) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public double getbalance() {
        return balance;
    }
    public void setbalance(double balance) {
        balance = balance;
    }
    public void deposit(double amount) {
        balance=balance+amount;
        System.out.println(amount+" deposit succesfully");
    }
    public void withdraw(double amount) {
        balance=balance-amount;
        System.out.println(amount+" withdrawal succesfully");
    }
    void displayAccountInfo(){};

}
