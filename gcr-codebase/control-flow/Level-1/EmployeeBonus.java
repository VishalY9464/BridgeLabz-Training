// Program to calculate bonus of an employee based on years of service
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        // take input from the user
        Scanner input = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();

        // Take years of service input
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        // Check if employee is eligible for bonus
        if (yearsOfService > 5) {
            // Calculate 5% bonus
            double bonusAmount = salary * 0.05;
            System.out.println("Bonus amount is: " + bonusAmount);
        } else {
            // Employee is not eligible for bonus
            System.out.println("No bonus applicable");
        }

        // Close Scanner resource
        input.close();
    }
}
