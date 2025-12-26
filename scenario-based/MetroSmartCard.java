//program for Find fare in Metro using smart card

import java.util.Scanner;

public class MetroSmartCard {

    // Method to calculate fare using ternary operator
    public static int calculateFare(int distance) {

        // If distance <= 5 km → fare = 10
        // If distance <= 15 km → fare = 20
        // Otherwise → fare = 30
        return (distance <= 5) ? 10 : (distance <= 15 ? 20 : 30);
    }

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take initial balance from the user
        System.out.print("Enter initial smart card balance: ");
        int balance = input.nextInt();

        // Loop will continue until balance is low or user exits
        while (true) {

            // Check if minimum balance is available
            if (balance < 10) {
                System.out.println("Insufficient balance. Please recharge your card.");
                break;
            }

            // Ask user to enter distance travelled
            System.out.print("\nEnter distance travelled (in km): ");
            int distance = input.nextInt();

            // Calculate fare using method
            int fare = calculateFare(distance);

            // Check if balance is sufficient for travel
            if (balance >= fare) {
                balance = balance - fare;

                // Display fare and remaining balance
                System.out.println("Fare deducted: ₹" + fare);
                System.out.println("Remaining balance: ₹" + balance);
            } else {
                System.out.println("Not enough balance for this journey.");
                break;
            }

            // Ask user whether to continue or exit
            System.out.print("Do you want to continue? (yes/no): ");
            String choice = input.next();

            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        // Final message
        System.out.println("\nThank you for using Delhi Metro Smart Card!");

        // Close scanner
        input.close();
    }
}
