package com.bankmanagement;


class Customer {

    // Name of the customer
    private String name;

    // Account associated with the customer
    Account account;

    // Constructor to initialize customer details
    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    // Method to deposit money
    public void deposit(double amount) {
        account.depositMoney(amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        account.withdrawMoney(amount);
    }

    // Method to display account details
    public void accountDetail() {
        System.out.println("Account Holder Name: " + name);
        account.display();
    }
}
