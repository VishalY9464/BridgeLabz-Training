//program to divide N number of chocolates among M children

import java.util.Scanner;

public class ChocolateDistribustion{
            public void divisionOfChocolate(int numberOfChocolate,int numberOfChildren){
			        //calculate number of chocolate each child get
					int numberOfChocolateEachChildGet=numberOfChocolate/numberOfChildren;
					
				    // calculate remaining chocolate;
					int remainingChocolate=numberOfChocolate%numberOfChildren;
					
					//print the results
					System.out.println("numbeof chocolate each child get: "+numberOfChocolateEachChildGet+"\nremainingChocolate: "+remainingChocolate);
			}
	       
    public static void main(String[]args){
	    //initialise the variables
		int numberOfChocolate;
		int numberOfChildren;
		
		//create the scanner object
		Scanner input=new Scanner(System.in);
		
		//take input from user
		System.out.print("\nEnter numberOfChocolate: ");
		numberOfChocolate=input.nextInt();
		
		System.out.print("\nEnter numberOfChildren: ");
		numberOfChildren=input.nextInt();
		
		//call the methods
		ChocolateDistribustion obj=new ChocolateDistribustion();
		obj.divisionOfChocolate(numberOfChocolate,numberOfChildren);
		
		
		
	}
}