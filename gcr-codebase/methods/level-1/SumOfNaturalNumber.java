//program to find the sum of n natural numbers using loop
import java.util.Scanner;
public class SumOfNaturalNumber{
      public static int sumOfNaturalNumber(int number){
	          //initialise a variable and assign it with 0
			  int sum=0;
			  if(number>0){
			     for(int i=1;i<=number;i++){
				 sum+=i;
				 }
			  }else{
			      System.out.println("Number is ");
			  }
			  return sum;
	  }
      public static void main(String[]args){
	    //initialise variable
		   int number;
		   
		//create scanner object
		Scanner input=new Scanner(System.in);
		
		//take input from users
		System.out.print("Enter Number:");
		number=input.nextInt();
		
		//create the variable to store the value
		
		int sumOfNaturalNumber=sumOfNaturalNumber(number);
		System.out.println("Sum Of Natural Number: "+sumOfNaturalNumber);
		
	  
	  }

}