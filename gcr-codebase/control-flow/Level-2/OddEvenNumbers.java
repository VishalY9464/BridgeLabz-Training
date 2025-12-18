// program to print odd and even numbers from 1 to the given number

import java.util.Scanner;

public class OddEvenNumbers{
   public static void main(String[]args){
       
       //Initialize variables
         int number;
       
         Scanner input=new Scanner(System.in);
         
      // Take input from users
         System.out.print("\nEnter Number:");
         number=input.nextInt();
         
      // Check Natural Number or not
         if(number>0){
             
             // iterate from 1 to number
             for(int i=1;i<=number;i++){
                 
                 // check odd or even
                 if(i%2==0){
                     System.out.println(i+" is an Even number");
                 }else{
                     System.out.println(i+" is an Odd number");
                 }
             }
         }else{
             System.out.println("Please enter a natural number");
         }
         //close the scanner
         input.close();
  }
}
