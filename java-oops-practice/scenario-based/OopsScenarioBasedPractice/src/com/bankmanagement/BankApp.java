package com.bankmanagement;

/*
 * Main class to test the Bank Management System
 */
public class BankApp {

    public static void main(String[] args) {

        // ----- SAVING ACCOUNT -----
        SavingAccount sa = new SavingAccount(0.05, "SA1001", 1000);
        Customer customer1 = new Customer("Vishal Yadav", sa);

        customer1.deposit(1000);
        customer1.withdraw(500);
        sa.calculateInterest();

        System.out.println("---- Saving Account Details ----");
        customer1.accountDetail();
        sa.displayInterest();

        System.out.println();

        // ----- CURRENT ACCOUNT -----
        CurrentAccount ca = new CurrentAccount("CA2001", 2000, 1000);
        Customer customer2 = new Customer("Rahul Sharma", ca);

        customer2.withdraw(2500); // allowed due to overdraft

        System.out.println("---- Current Account Details ----");
        customer2.accountDetail();
        ca.displayCurrentAccount();
    }
}
