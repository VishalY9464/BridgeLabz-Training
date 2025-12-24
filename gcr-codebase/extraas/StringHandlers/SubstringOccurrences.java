// Java program to count how many times a given substring occurs in a string
import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count substring occurrences
    public static int countOccurrences(String string, String substring) {
        int count = 0;
        int index = 0;

        while ((index = string.indexOf(substring, index)) != -1) {
            count++;
            index = index + substring.length(); // move forward
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter the main string: ");
        String string = input.nextLine();

	System.out.print("Enter the substring: ");
        String substring = input.nextLine();
		
        // Displaying the result
        int result = countOccurrences(string, substring);
        System.out.println("Substring occurs " + result + " times.");
        
	// Closing scanner stream
        input.close();
    }
}
