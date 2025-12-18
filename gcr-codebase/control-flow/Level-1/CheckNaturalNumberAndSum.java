// program to check for the natural number and write the sum of n natural numbers 

import java.util.Scanner;

public class CheckNaturalNumberAndSum{
   public static void main(String[]args){
       //Initialize variables
         int number;
       
         Scanner input=new Scanner(System.in); 
      // Take input from users
         System.out.print("\nEnter Number:");
         number=input.nextInt();
         
      // Check Natural Number or not
         
         if(number>=0){
                
                 //number is natural number so calculate sum of natural number
                   int sumOfNaturalNumber=number*(number+1)/2;
                 
                 //display the result
                 System.out.println("The sum of "+ number +" natural numbers is "+sumOfNaturalNumber) ;
          }else{
                System.out.println("The number "+ number +" is not a natural number"); 
               }
         input.close();
 
  }
}