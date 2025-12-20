//program calculate the wind chill temperature given the temperature and wind speed

import java.util.Scanner;

public class CalculateTemperatureAndWindSpeed{
       public double calculateWindChill(double temperature, double windSpeed){
	        
			//calculat windChill using temperature and windSpeed
            double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
			return windChill;
	   }
       public static void main(String[]args){
	     //initialise variable
		 double temperature;
		 double windSpeed;
		 
		 //create scanner object
		 Scanner input=new Scanner(System.in);
		 
		 //take input from temperature and windSpeed
		 System.out.print("\nEnter temperature: ");
		 temperature=input.nextDouble();
		 System.out.print("\nEnter windSpeed: ");
		 windSpeed=input.nextDouble();
		 
		 //create object of CalculateTemperatureAndWindSpeed class 
		 
		 CalculateTemperatureAndWindSpeed calculate=new CalculateTemperatureAndWindSpeed();
		 
		 //call the method 
		 double windChill=calculate.calculateWindChill( temperature,  windSpeed);
		 
		 //display the result of calculation
		 System.out.println("Calculation of TemperatureAndWindSpeed: "+ windChill);
		 
	    // close the scanner
		input.close();
	   
	   }
}