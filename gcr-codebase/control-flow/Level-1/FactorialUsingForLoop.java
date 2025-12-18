// Program to calculate factorial using for loop
import java.util.Scanner;


public class FactorialUsingForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial not defined for negative numbers");
        } else {
            int factorial = 1;

            // calculate factorial
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        input.close();
    }
}
