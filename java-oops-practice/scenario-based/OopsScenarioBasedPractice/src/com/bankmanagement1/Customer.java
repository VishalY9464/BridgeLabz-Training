package com.bankmanagement1;

class Customer {

    // Customer name
    private String name;

    // Account associated with customer
    Account account;

    // Constructor
    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    // Deposit money
    public void deposit(double amount) {
        account.depositMoney(amount);
    }

    // Withdraw money
    public void withdraw(double amount) {
        account.withdrawMoney(amount);
    }

    // Display account details
    public void accountDetail() {
        System.out.println("Account Holder Name: " + name);
        account.display();
    }
}
