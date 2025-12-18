// Program to find sum until user enters 0 or negative number
import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0.0;

        // infinite loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = input.nextDouble();

            // break condition
            if (value <= 0) {
                break;
            }

            total = total + value;
        }

        System.out.println("Total sum is: " + total);
        input.close();
    }
}
