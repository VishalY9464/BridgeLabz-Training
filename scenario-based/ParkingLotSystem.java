// Program for Parking Lot Gate System

import java.util.Scanner;

public class ParkingLotSystem {

    // Method to check if parking is full
    public static boolean isFull(boolean[] occupancy) {
        for (boolean slot : occupancy) {
            if (!slot) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Parking area with 10 slots
        boolean[] parkingArea = new boolean[10];
        int lot = 0;

        while (true) {
            System.out.println("\n--- Parking Lot Menu ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Show Occupancy");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int option = input.nextInt();

            switch (option) {

                case 1:
                    if (isFull(parkingArea)) {
                        System.out.println("Parking Area is FULL!");
                    } else {
                        parkingArea[lot] = true;
                        System.out.println("Parking successful at slot: " + (lot + 1));
                        lot++;
                    }
                    break;

                case 2:
                    System.out.println("Parking Status:");
                    for (int i = 0; i < parkingArea.length; i++) {
                        if (parkingArea[i]) {
                            System.out.println("Slot " + (i + 1) + ": Occupied");
                        } else {
                            System.out.println("Slot " + (i + 1) + ": Empty");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting system...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Option! Try again.");
            }
        }
		
		//close the Scanner
		input.close();
    }
}
