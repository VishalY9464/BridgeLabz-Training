package com.bankmanagement;

/*
 * SavingAccount is a child class of Account.
 * It adds interest functionality to a normal account.
 */
public class SavingAccount extends Account {

    // Interest rate for savings account
    private double interestRate;

    // Constructor to initialize saving account details
    public SavingAccount(double interestRate, String accountNumber, double balance) {
        super(accountNumber, balance); // calling parent constructor
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public void calculateInterest() {
        balance += balance * interestRate;
    }

    // Method to display balance after interest
    public void displayInterest() {
        System.out.println("Balance after interest: " + balance);
    }
}
