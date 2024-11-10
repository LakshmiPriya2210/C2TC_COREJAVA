package com.tns.ifet.assignment.banktransaction;

public class SavingsAccount extends Account {
	private double interestRate = 0.03;  // Example interest rate

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate); // Deposit with interest
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in Savings Account");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
