//program for factorial using recursion
import java.util.Scanner;

public class FactorialUsingRecursion {

    // Recursive method to calculate factorial
    public static long factorial(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);
        //initialise variable
        System.out.print("Enter a number: ");
        int number = input.nextInt();

         //call the factorial method
        long result = factorial(number);

         //print the result
        System.out.println("Factorial: " + result);

        //close the scanner         
        input.close();
    }
}
