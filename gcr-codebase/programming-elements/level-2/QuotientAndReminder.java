// Program to print quotient and remainder

import java.util.Scanner;

public class QuotientAndReminder {
    public static void main(String[] args) {

        // declare variables
        int number1;
        int number2;

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();  

        // Calculation for quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display the result
        System.out.println(
            "The Quotient is " + quotient +
            " and Remainder is " + remainder +
            " of two numbers " + number1 + " and " + number2
        );

        input.close(); 
    }
}
