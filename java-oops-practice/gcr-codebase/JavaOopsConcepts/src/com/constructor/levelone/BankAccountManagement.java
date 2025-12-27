package com.constructor.levelone;

// BankAccount class
class BankAccount {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // get balance
    public double getBalance() {
        return balance;
    }
}

// Child class
class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

// Main class
public class BankAccountManagement {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(123456, "Vishal");

        account.display();

        account.setBalance(50000);
        System.out.println("Balance: " + account.getBalance());
    }
}
