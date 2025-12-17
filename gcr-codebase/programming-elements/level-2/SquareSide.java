// calculating the side of square using perimeter
 
import java.util.Scanner;
public class SquareSide{
  public static void main(String[]args){

    //Declare Perimeter of Square
     double perimeter;

    Scanner input=new Scanner(System.in);
  
   //Take Input(Perimeter) from user 
     perimeter=input.nextDouble();
   
  //Calculating side by using perimeter
    double side=perimeter/4;

  //Display the result
     System.out.print("The length of the side is "+side+"whose perimeter is "+ perimeter);
    


      

 }
}
