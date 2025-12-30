//program for LibraryReminderApp 

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryReminderApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i);

            // Input return date
            System.out.print("Enter return date (yyyy-mm-dd): ");
            String returnDateInput = input.nextLine();
            LocalDate returnDate = LocalDate.parse(returnDateInput);

            // Input due date
            System.out.print("Enter due date (yyyy-mm-dd): ");
            String dueDateInput = input.nextLine();
            LocalDate dueDate = LocalDate.parse(dueDateInput);

            double fine = 0;

            // Check late return
            if (returnDate.isAfter(dueDate)) {
                long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);
                fine = daysLate * 5;
                System.out.println("Returned late by " + daysLate + " days.");
                System.out.println("Fine: ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine.");
            }
        }

        System.out.println("\nAll book records processed.");
        input.close();
    }
}
