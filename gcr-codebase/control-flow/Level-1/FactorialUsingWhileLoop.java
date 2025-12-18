// Program to calculate factorial using while loop
import java.util.Scanner;


public class FactorialUsingWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial not defined for negative numbers");
        } else {
            int factorial = 1;
            int i = 1;

            // calculate factorial
            while (i <= number) {
                factorial = factorial * i;
                i++;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        input.close();
    }
}
