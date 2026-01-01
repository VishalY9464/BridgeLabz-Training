package com.bankmanagement1;

public class Account {

    // Account number of the customer
    protected String accountNumber;

    // Current balance in the account
    protected double balance;

    // Constructor to initialize account details
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit money into account
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw money from account
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display account details
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
