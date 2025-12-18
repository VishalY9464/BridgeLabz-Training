//program to check if the first is the smallest of the 3 numbers.

import java.util.Scanner;

public class CheckFirstNumberIsSmallest{
      public static void main(String[]args){
       //Initialize variables
         int number1,number2,number3;
       
         Scanner input=new Scanner(System.in);
         //take inputs from user
         System.out.print("/nEnter First Number:");
         number1=input.nextInt();
         System.out.print("Enter Second Number:");
         number2=input.nextInt();
         System.out.print("Enter Third Number:");
         number3=input.nextInt();
          
         //check first number is smallest 

         if(number1<number2 && number1<number3){
                System.out.print("Is the first number the smallest? Yes");
            }else{
                  System.out.print("Is the first number the smallest? No");
                 }
         //Closing the scanner stream
         input.close();
 
    }

}