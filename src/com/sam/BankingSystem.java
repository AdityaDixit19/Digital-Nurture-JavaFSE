package com.sam;

import java.util.ArrayList;

public class BankingSystem {
    public static void main(String[] args) {
        ArrayList <BankAccount>accounts=new ArrayList<>();
        accounts.add(new SavingsAccount(101,"rahul",10000,5));
        accounts.add(new CurrentAccount(102,"Amit",20000,5000));
        accounts.get(0).deposit(3000);
        accounts.get(1).withdraw(2000);
        for(BankAccount account:accounts){
            account. displayAccountInfo();
            System.out.println(account);
        }
    }
}
