package com.tns.ifet.assignment.banktransaction;

abstract class Account {
	protected double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
        Bank.incrementTotalAccounts();  // Increase account count when an account is created
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract double getBalance();

    // Common functionality for all accounts
    public void printBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}
