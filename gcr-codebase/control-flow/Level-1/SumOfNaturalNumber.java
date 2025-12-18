// Program to find sum of n natural numbers and verify using formula
import java.util.Scanner;


public class SumOfNaturalNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // check for natural number
        if (n <= 0) {
            System.out.println("Entered number is not a natural number");
        } else {
            int sumByLoop = 0;
            int i = 1;

            // calculate sum using while loop
            while (i <= n) {
                sumByLoop = sumByLoop + i;
                i++;
            }

            // calculate sum using formula
            int sumByFormula = n * (n + 1) / 2;

            // display results
            System.out.println("Sum using while loop: " + sumByLoop);
            System.out.println("Sum using formula: " + sumByFormula);
        }

        input.close();
    }
}
