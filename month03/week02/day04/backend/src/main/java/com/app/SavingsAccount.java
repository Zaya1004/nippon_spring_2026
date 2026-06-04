package com.app;

public class SavingsAccount extends BankAccount{
    private double minBalance;
    SavingsAccount(String owner, double initialBalance, double minBalance){
        super(owner, initialBalance);
        this.minBalance = minBalance;
    }

    @Override
    void withdraw(double amount){
        if (balance - amount < minBalance){
            throw new IllegalStateException("Would go below minimum balance");
        }
        balance -= amount;
    }

    @Override
    double monthlyFee(){
        return 0;
    }
}
