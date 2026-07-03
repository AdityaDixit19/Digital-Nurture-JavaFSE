package com.sam;
import java.util.ArrayList;
public class BankingSystem {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList();
        accounts.add(new SavingsAccount(101, "rahul", (double)10000.0F, (double)5.0F));
        accounts.add(new CurrentAccount(102, "Amit", (double)20000.0F, (double)5000.0F));
        ((BankAccount)accounts.get(0)).deposit((double)3000.0F);
        ((BankAccount)accounts.get(1)).withdraw((double)2000.0F);

        for(BankAccount account : accounts) {
            account.displayAccountInfo();
            System.out.println(account);
        }

    }
}