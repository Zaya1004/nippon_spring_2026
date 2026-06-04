package com.app;

public abstract class BankAccount {
    protected String owner;
    protected double balance;
    BankAccount(String owner, double initialBalance){
        this.owner = owner;
        this.balance = initialBalance;
    }

    void deposit(double amount){
        if (amount > 0) balance += amount;
    }

    abstract void withdraw(double amount);
    abstract double monthlyFee();

    double getBalance(){
        return balance;
    }
    void applyMonthlyFee(){
        balance -= monthlyFee();
    }

    @Override
    public String toString(){
        return owner + "|" + getClass().getSimpleName() + "|" + balance;
    }
}
