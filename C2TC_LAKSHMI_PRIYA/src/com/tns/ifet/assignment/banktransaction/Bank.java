package com.tns.ifet.assignment.banktransaction;

public class Bank {
	private static int totalAccounts = 0;  // Static variable shared among all instances

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void incrementTotalAccounts() {
        totalAccounts++;
    }
}
