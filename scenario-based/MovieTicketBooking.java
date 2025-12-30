//program for movie ticket booking

import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int goldSeats = (int) (Math.random() * 10) + 1;
        int silverSeats = (int) (Math.random() * 10) + 1;

        boolean continueBooking = true;

        System.out.println(" Welcome to Movie Ticket Booking System");

        while (continueBooking && (goldSeats + silverSeats > 0)) {

            // Movie selection
            System.out.println("\nSelect Movie:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");

            System.out.print("Enter movie choice: ");
            int movieChoice = input.nextInt();

            switch (movieChoice) {
                case 1:
                    System.out.println("You selected Action Movie");
                    break;
                case 2:
                    System.out.println("You selected Comedy Movie");
                    break;
                case 3:
                    System.out.println("You selected Drama Movie");
                    break;
                default:
                    System.out.println("Invalid movie choice!");
                    continue;
            }

            // Seat selection
            System.out.println("\nChoose Seat Type:");
            System.out.println("1. Gold Seat");
            System.out.println("2. Silver Seat");

            int seatChoice = input.nextInt();

            if (seatChoice == 1 && goldSeats > 0) {
                goldSeats--;
                System.out.println(" Gold seat booked!");
            } 
            else if (seatChoice == 2 && silverSeats > 0) {
                silverSeats--;
                System.out.println("Silver seat booked!");
            } 
            else {
                System.out.println(" Selected seat not available.");
                continue;
            }

            // Snacks
            System.out.print("Do you want snacks? (1-Yes / 2-No): ");
            int snackChoice = input.nextInt();

            if (snackChoice == 1) {
                System.out.println(" Snacks added!");
            } else {
                System.out.println("No snacks selected.");
            }

            // Continue or exit
            System.out.print("\nDo you want to book another ticket? (1-Yes / 2-No): ");
            int next = input.nextInt();

            if (next != 1) {
                continueBooking = false;
            }
        }

        System.out.println("\nBooking Closed. Enjoy your movie!");
        input.close();
    }
}
