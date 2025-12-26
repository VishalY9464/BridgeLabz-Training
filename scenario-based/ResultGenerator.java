import java.util.Scanner;

public class ResultGenerator {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Array to store marks of 5 subjects
        int[] marks = new int[5];

        int total = 0;
        double average;
        char grade;

        // Taking input using for loop
        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
            total += marks[i]; // adding marks
        }

        // Calculate average
        average = total / 5.0;

        // Assign grade using switch-case
        switch ((int) average / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        // Display result
        System.out.println("\n----- Result Summary -----");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        // Close scanner
        input.close();
    }
}
