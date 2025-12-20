//program to take 2 numbers and print their quotient and reminder

import java.util.Scanner;

public class FindRemainderAndQuotient{

       public static int[] findRemainderAndQuotient(int number, int divisor) {
	        
			//find quotient
			int quotient=number/divisor;
			
			//find remainder
			int remainder=number%divisor;
			
			//create an array to store these value
			int[]divide=new int[2];
			
			//assign value in array 
			divide[0]=quotient;
			divide[1]=remainder;
			
			// return the array
			return divide;
	   }
	   
	   public static void displayQuotientAndRemainder(int[]divide){
	   
	    System.out.print("Quotient is: "+divide[0]);
		System.out.print("\nRemainder is: "+divide[1]);
		
	   }
     
       public static void main(String[]args){
	        //initialise numbers 
			int number;
			int divisor;
			//create scanner object
			Scanner input=new Scanner(System.in);
			
			//take input from user
			System.out.print("\nEnter Number: ");
			number=input.nextInt();
			
			System.out.print("\nEnter divisor: ");
			divisor=input.nextInt();
			
		   //method call
		   int[]remainderAndQuotient=findRemainderAndQuotient(number,divisor);
		   displayQuotientAndRemainder(remainderAndQuotient);
			
	   }
} 