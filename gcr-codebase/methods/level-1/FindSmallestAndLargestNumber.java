//program to find the smallest and the largest of the 3 numbers

import java.util.Scanner;

public class FindSmallestAndLargestNumber{
       public static void smallestAndLargestNumber(int number1,int number2, int number3){
	    //find largest number
		 if(number1>number2 && number1>number3){
		        System.out.println(number1+" is largest number");
		 }
		 else if(number2>number1 && number2>number3){
		    System.out.println(number2+" is largest number");  
		 }
		 else if(number3>number1 && number3>number2){
		    System.out.println(number3+" is largest number");
		 }
		 
		 //find smalllest number
		  if(number1<number2 && number1<number3){
		        System.out.println(number1+" is smallest number");
		 }
		 else if(number2<number1 && number2<number3){
		    System.out.println(number2+" is smallest number");  
		 }
		 else if(number3<number1 && number3<number2){
		    System.out.println(number3+" is smallest number");
		 }
		 
	   }
   public static void main(String[]args){
     //initialise variable
	   int number1,number2,number3;
	   
	 //create scanner object
	   
	   Scanner input=new Scanner(System.in);
	   
	   //take input from users
	   System.out.print("\nEnter First Number: ");
	   number1=input.nextInt();
	   System.out.print("\nEnter Second Number: ");
	   number2=input.nextInt();
	   System.out.print("\nEnter Third Number: ");
	   number3=input.nextInt();
	   
	  //method call  
	   smallestAndLargestNumber(number1,number2, number3);
	   
   
   }
}