package com.tns.ifet.assignment.banktransaction;

public final class Transaction {
	 private final double transactionFee = 2.5;  // Fixed fee for each transaction

	    public final void performTransaction(Account account, double amount, String type) {
	        switch (type.toLowerCase()) {
	            case "deposit":
	                account.deposit(amount - transactionFee);  // Deduct fee
	                System.out.println("Deposited $" + amount + " with a fee of $" + transactionFee);
	                break;
	            case "withdraw":
	                account.withdraw(amount + transactionFee);  // Add fee to withdrawal amount
	                System.out.println("Withdrew $" + amount + " with a fee of $" + transactionFee);
	                break;
	            default:
	                System.out.println("Invalid transaction type");
	        }
	    }
}
