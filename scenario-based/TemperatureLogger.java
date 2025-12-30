
import java.util.Scanner;
public class TemperatureLogger{
	    public static void averageAndMaxTemeperature(double[]arr){
			//initialise variables;
			double maxTemperature=0;
			double sumOfTemperature=0;
			for(int i=0;i<arr.length;i++){
				sumOfTemperature+=arr[i];
				if(arr[i]>maxTemperature){
					maxTemperature=arr[i];
				}
			}
			//initialise variable to store average
			double average=sumOfTemperature/arr.length;
			//display the results
			System.out.println("Average of Temperature: "+average+
			                   "\nmaxTemperature: "+ maxTemperature           
		    );
		}
    public static void main(String[]args){
	
        //create scanner object
		Scanner input=new Scanner(System.in);
		
		//size of array
		System.out.print("\nEnter number of day:");
		int size=input.nextInt();
		
		//create array to store Temperature 
		double[]temperature=new double[size];
		//take input from users
		for(int i=0;i<size;i++){
			System.out.print("\nEnter temperature on "+(i+1)+" day :");
			temperature[i]=input.nextDouble();
		}
		//call the method for average and maxTemperature
		averageAndMaxTemeperature(temperature);
		
	}
}