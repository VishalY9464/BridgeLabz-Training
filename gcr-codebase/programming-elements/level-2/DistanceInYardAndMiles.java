//Program for find the distance in yards and miles using distance in feet

import java.util.Scanner;
public class DistanceInYardAndMiles{
    public static void main(String[]args){
     
     //declare variable in feet
     double distanceInFeet;
     
    Scanner input=new Scanner(System.in);
    //take input from user as distance in feet
    distanceInFeet=input.nextDouble();
    
    //converting feet into yards 
      double yards=distanceInFeet/3;

   //converting yard into miles
     double miles=yards/1760;

   //Display the results
    System.out.print("The distance in yards is "+yards+" while the distance in miles is "+miles);
  

 }
}