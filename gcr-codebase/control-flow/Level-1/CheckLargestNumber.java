//program to check if the first, second, or third number is the largest of the three.

import java.util.Scanner;

public class CheckLargestNumber{
   public static void main(String[]args){
         //Initialize variables
           int number1,number2,number3;
         
           Scanner input=new Scanner(System.in);
           
         //take inputs from user
         System.out.print("\nEnter First Number:");
         number1=input.nextInt();
         System.out.print("Enter Second Number:");
         number2=input.nextInt();
         System.out.print("Enter Third Number:");
         number3=input.nextInt();
          
         //check which number is Largest

         if(number1>number2 && number1>number3){
                System.out.print("Is the first number the largest? Yes");
            }
         
        else if(number2>number1 && number2>number3){
                  System.out.print("Is the Second number the largest? Yes");
                 }else{
                         System.out.print("Is the Third number the largest? Yes");
                      }

         //Closing the scanner stream
         input.close();

  }
}