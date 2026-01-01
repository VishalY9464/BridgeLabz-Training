package com.bankmanagement;

public class BankApp {

    public static void main(String[] args) {

        // Create a savings account object
        SavingAccount sa = new SavingAccount(0.05, "98896273", 1000);

        // Create customer and link account
        Customer c1 = new Customer("Vishal Yadav", sa);

        // Perform operations
        c1.deposit(1000);
        c1.withdraw(500);

        // Calculate interest
        sa.calculateInterest();

        // Display final account details
        c1.accountDetail();
        sa.displayInterest();
    }
}
