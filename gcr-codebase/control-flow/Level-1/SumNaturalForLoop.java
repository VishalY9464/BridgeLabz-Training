// Program to find sum of n natural numbers using for loop
import java.util.Scanner;


public class SumNaturalUsingForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Entered number is not a natural number");
        } else {
            int sumByLoop = 0;

            // calculate sum using for loop
            for (int i = 1; i <= n; i++) {
                sumByLoop = sumByLoop + i;
            }

            int sumByFormula = n * (n + 1) / 2;

            System.out.println("Sum using for loop: " + sumByLoop);
            System.out.println("Sum using formula: " + sumByFormula);
        }

        input.close();
    }
}
