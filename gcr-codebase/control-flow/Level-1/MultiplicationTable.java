// Program to print multiplication table from 6 to 9
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         //Take Input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // print table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        // close scanner class 
        input.close();
    }
}
