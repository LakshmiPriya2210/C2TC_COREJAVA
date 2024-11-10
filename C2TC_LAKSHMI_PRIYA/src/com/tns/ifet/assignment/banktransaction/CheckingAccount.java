package com.tns.ifet.assignment.banktransaction;

public class CheckingAccount extends Account {
	private double overdraftLimit = 100.0; 

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded in Checking Account");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
