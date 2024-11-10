package com.tns.ifet.assignment.banktransaction;

public class Main {
    public static void main(String[] args) {
        // Creating Savings and Checking accounts
        Account savings = new SavingsAccount(1000);
        Account checking = new CheckingAccount(500);

        // Static variable usage
        System.out.println("Total accounts created: " + Bank.getTotalAccounts());

        // Transaction process
        Transaction transaction = new Transaction();

        transaction.performTransaction(savings, 200, "deposit");
        transaction.performTransaction(checking, 150, "withdraw");

        // Display balances after transactions
        savings.printBalance();
        checking.printBalance();
    }
}
