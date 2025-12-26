// Program to design a polling booth system

import java.util.Scanner;

public class ElectionManager {

    // Static variables to store vote counts
    static int candidateOne = 0;
    static int candidateTwo = 0;
    static int candidateThree = 0;

    // Method to check age and allow voting
    public static void checkAge(int age, Scanner input) {

        // Check for invalid age
        if (age <= 0) {
            System.out.println("Invalid age!");
            return;
        }

        // Check eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");

            // Display candidates
            System.out.println("1. Candidate A");
            System.out.println("2. Candidate B");
            System.out.println("3. Candidate C");

            System.out.print("Enter your choice: ");
            int vote = input.nextInt();

            // Record vote
            if (vote == 1) {
                candidateOne++;
            } else if (vote == 2) {
                candidateTwo++;
            } else if (vote == 3) {
                candidateThree++;
            } else {
                System.out.println("Invalid vote!");
            }

        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    // Method to display final results
    public static void displayResult() {
        System.out.println("\n----- Election Result -----");
        System.out.println("Candidate A Votes: " + candidateOne);
        System.out.println("Candidate B Votes: " + candidateTwo);
        System.out.println("Candidate C Votes: " + candidateThree);
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        while (true) {
            // Take age input
            System.out.print("\nEnter age (Enter -1 to exit): ");
            int age = input.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Call method to check eligibility and vote
            checkAge(age, input);
        }

        // Display final results
        displayResult();

        // Close scanner
        input.close();
    }
}
