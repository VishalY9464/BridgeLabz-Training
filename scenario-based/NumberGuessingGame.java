//program for Guessing the Number

import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String[]args){
	    
		//Create scanner object
		Scanner input=new Scanner(System.in);
		
		//generate a random Number
		int secretNumber=(int)(Math.random()*100)+1;
		int countAttempt=0;
		int guessNumber;
	    final int MAX_ATTEMPTS = 5;
		
		
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("You have only " + MAX_ATTEMPTS + " attempts.\n");
		
		do{
			// take input number to guess from user
			System.out.println("Enter Number to guess: ");
			guessNumber=input.nextInt();
			countAttempt++;
			
			//Validation
		    if (guessNumber < 1 || guessNumber > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }
			
			if(guessNumber>secretNumber){
				System.out.println("Guess Number is too high!!");
				
			}
			else if(guessNumber<secretNumber){
			    System.out.println("Guess Number is too low!!");
			}
			else{
				System.out.println("Congratulations!! You have guessed the number in :)"+ countAttempt+" Attempts");
				break;
			}
			
		}while(countAttempt<MAX_ATTEMPTS);
		
	         if (countAttempt == MAX_ATTEMPTS && guessNumber != secretNumber) {
                System.out.println("\n Game Over!");
                System.out.println("The correct number was: " + secretNumber);
        }
        
		//close the scanner
        input.close();
		
		
		
	}

}
