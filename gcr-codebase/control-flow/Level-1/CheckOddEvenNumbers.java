// Program to check and print whether numbers are Odd or Even
import java.util.Scanner;

public class CheckOddEvenNumbers {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // enter a natural number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the entered number is a natural number
        if (number <= 0) {
            System.out.println("Not a natural number");
        } else {

            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {

                // Check if the current number is even
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    // If not even, then it is odd
                    System.out.println(i + " is Odd");
                }
            }
        }

        // Close the Scanner object
        input.close();
    }
}
