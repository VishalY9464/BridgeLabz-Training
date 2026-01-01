package com.bankmanagement1;


public class CurrentAccount extends Account {

    // Overdraft limit allowed
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding withdraw method to allow overdraft
    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    // Display account details
    public void displayCurrentAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
