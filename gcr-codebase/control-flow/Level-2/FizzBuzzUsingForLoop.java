// program to implement FizzBuzz using for loop

import java.util.Scanner;

public class FizzBuzzUsingForLoop{
   public static void main(String[]args){
       
       //Initialize variables
         int number;
       
         Scanner input=new Scanner(System.in);
         
      // Take input from users
         System.out.print("\nEnter Number:");
         number=input.nextInt();
         
      // Check positive integer
         if(number>0){
             
             // iterate from 1 to number
             for(int i=1;i<=number;i++){
                 
                 if(i%3==0 && i%5==0){
                     System.out.println("FizzBuzz");
                 }
                 else if(i%3==0){
                     System.out.println("Fizz");
                 }
                 else if(i%5==0){
                     System.out.println("Buzz");
                 }else{
                     System.out.println(i);
                 }
             }
         }else{
             System.out.println("Please enter a positive integer");
         }
     
         // cloase the scanner
         input.close();
  }
}
