package com.bankmanagement1;

public class SavingAccount extends Account {

    // Interest rate for savings account
    private double interestRate;

    // Constructor
    public SavingAccount(double interestRate, String accountNumber, double balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public void calculateInterest() {
        balance += balance * interestRate;
    }

    // Display balance after interest
    public void displayInterest() {
        System.out.println("Balance after interest: " + balance);
    }
}
