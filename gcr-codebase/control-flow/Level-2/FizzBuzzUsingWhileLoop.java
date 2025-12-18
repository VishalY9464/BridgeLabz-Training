// program to implement FizzBuzz using while loop

import java.util.Scanner;

public class FizzBuzzUsingWhileLoop{
   public static void main(String[]args){
       
       //Initialize variables
         int number;
         int counter=1;
       
         Scanner input=new Scanner(System.in);
         
      // Take input from users
         System.out.print("\nEnter Number:");
         number=input.nextInt();
         
      // Check positive integer
         if(number>0){
             
             while(counter<=number){
                 
                 if(counter%3==0 && counter%5==0){
                     System.out.println("FizzBuzz");
                 }
                 else if(counter%3==0){
                     System.out.println("Fizz");
                 }
                 else if(counter%5==0){
                     System.out.println("Buzz");
                 }else{
                     System.out.println(counter);
                 }
                 counter++;
             }
         }else{
             System.out.println("Please enter a positive integer");
         }
         
         //Close the Scanner
         input.close();
  }
}
