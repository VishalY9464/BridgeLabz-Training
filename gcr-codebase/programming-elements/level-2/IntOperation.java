// Program to demonstrate integer operations and operator precedence

import java.util.Scanner;

public class IntOperation {

    public static void main(String[] args) {

        // Declare variables
        int a, b, c;

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter value of a: ");
        a = input.nextInt();

        System.out.print("Enter value of b: ");
        b = input.nextInt();

        System.out.print("Enter value of c: ");
        c = input.nextInt();

        // Integer operations demonstrating operator precedence
        int result1 = a + b * c;   // Multiplication (*) has higher precedence
        int result2 = a * b + c;   // Multiplication (*) evaluated first
        int result3 = c + a / b;   // Division (/) evaluated first
        int result4 = a % b + c;   // Modulus (%) evaluated first

        // Display results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        // Close scanner
        input.close();
    }
}
