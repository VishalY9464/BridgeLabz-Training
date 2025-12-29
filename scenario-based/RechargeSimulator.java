//program for display recharge offer and then recharge and then display balance in loop repeated way
import java.util.Scanner;
public class RechargeSimulator{
    public static void main(String[]args){
	    //create scanner object
	    Scanner input=new Scanner(System.in);
		
		//initialise balance 
		double balance=0.0;
		
		while(true){
			System.out.print("1-Jio"+"\n2-Airtel"+"\n3-VI"+"\n4-exit");
			System.out.println("\nChoose options:");
			int options=input.nextInt();
			switch(options){
				case 1 -> System.out.println("Jio provide offer get 1.5gb/day in only $299");
				case 2 -> System.out.println("Airtel provide offer get 2gb/day in only $319");
				case 3 -> System.out.println("VI provide offer get 1.5gb/day and 6am to 12am free internet service in only $299");
				case 4 -> System.exit(0);
				default-> System.out.println("Their is no any offer");
			}
			
			//take amount from user
			System.out.println("Enter recharge amount:"); 
			double amount=input.nextDouble();
			balance+=amount;
			System.out.println("Recharge Succesfull!!"+"Your "+ amount +" recharge activated");
			System.out.println("Your current balance is "+ balance);
			
		}
			
		//close the Scanner
        input.close();		
		
	}
}