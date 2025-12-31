//program for online Quize

import java.util.Scanner;

public class OnlineQuiz{
    public static void main(String[]args){
	
	    //create new scanner object
	    Scanner input=new Scanner(System.in);
	
	    //create array to store question;
     	String[] questions={
		    "1.What is the size of boolean in Java?\nA. 1 bit\nB. 2 bytes\nC. 4 bytes\nD. 8 bytes",
		    "2.Which keyword is use to inherit class in java?\nA. class\nB. extends\nC. implements\nD. inherit",
	       	"3.Which loop execute at least once?\nA. while\nB. for\nC. do-while\nD. for-each",
	    	"4.Which operator is use for logical  AND?\nA. &\nB. &&\nC. ||\nD. |",
	    	"5.Which method is entry point of java?\nA. main\nB.  abstract\nC. custom\nD. non-static",	
	    };
		
		//store correct answer
		char[]correctAnswer={'A','B','C','A','A'};
		
		//store correct answer
		int score=0;
		
		for(int i=0;i<questions.length;i++){
			
			System.out.println("\n"+questions[i]);
			System.out.println("\nEnter your answer (A/B/C/D) ==>");
			char userAnswer=input.next().toUpperCase().charAt(0);
			
			//advance switch for answer checking
			
			switch(userAnswer){
				
				case 'A','B','C','D' -> {
					if(userAnswer==correctAnswer[i]){
						System.out.println("Congratulations!! you choosen correct answer:)");
						score+=5;
					}
					else{
						System.out.println("Sorry! you choose wrong answer!");
					}
				}
				default -> System.out.println("Invalid! choose currect options");
			}
			
		}
		
		//display final result
		
		System.out.println("\n---Quize Completed---");
		System.out.println("Your score "+ score +" out of "+ questions.length);
		
		//close the scanner
		input.close();
	
	
	
	}
}