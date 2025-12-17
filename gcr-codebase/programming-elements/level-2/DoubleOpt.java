// Program to demonstrate double operations and operator precedence

import java.util.Scanner;

public class DoubleOpt {

    public static void main(String[] args) {

        // Declare variables
        double a, b, c;

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter value of a: ");
        a = input.nextDouble();

        System.out.print("Enter value of b: ");
        b = input.nextDouble();

        System.out.print("Enter value of c: ");
        c = input.nextDouble();

        // Double operations demonstrating operator precedence
        double result1 = a + b * c;   // * has higher precedence
        double result2 = a * b + c;   // * evaluated before +
        double result3 = c + a / b;   // / evaluated before +
        double result4 = a % b + c;   // % evaluated before +

        // Display results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        // Close scanner
        input.close();
    }
}
