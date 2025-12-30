//program for Sandeep’s Fitness Challenge Tracker 

import java.util.Scanner;
public class FitnessChallengeTracker{
	public static void averageAndTotalPushUp(int[]pushUps){
		int sumOfPushUps=0;
		int activeDays=0;
		for(int i=0;i<pushUps.length;i++){
			if(pushUps[i]==0){
				continue;
			}else{
				sumOfPushUps+=pushUps[i];
				activeDays++;
				
			}
		}
		double averageOfPushUps=(double)sumOfPushUps/activeDays;
		System.out.println("Total Number of pushUps: "+sumOfPushUps+
		                   "\nAverage of pushUps: "+averageOfPushUps
						   );
		
	}
    public static void main(String[]args){
	    
        //create scanner object
        Scanner input=new Scanner(System.in);
   
        //create array store push-ups
        int[]pushUps=new int[7];
		
		//take input from user to store number of push-ups
		for(int i=0;i<7;i++){
		    System.out.print("\nEnter pushUps on "+(i+1)+" day:");
			pushUps[i]=input.nextInt();
		}
		//call method to average method and total pushUps
		averageAndTotalPushUp(pushUps);
	}
}