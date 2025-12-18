import java.util.Scanner;

// Program to calculate sum until user enters 0
public class SumUntilZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // total will store the final sum
        double total = 0.0;
        double value;

        // take first input
        System.out.print("Enter a number (0 to stop): ");
        value = input.nextDouble();

        // continue until user enters 0
        while (value != 0) {
            total = total + value;

            System.out.print("Enter a number (0 to stop): ");
            value = input.nextDouble();
        }

        // print final result
        System.out.println("Total sum is: " + total);

        input.close();
    }
}
