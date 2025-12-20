//program to calculate various trigonometric functions
import java.util.Scanner;


public class TrigonometricCalculation{
	// create function which calculate trigonometric function
	public double[] calculateTrigonometricFunctions(double angle){
		 //convert the angle into radian
	  double radian=Math.toRadians(angle);
	  
	  //calculate sine,cosine,tangent
	  double sine=Math.sin(radian);
	  double cosine=Math.cos(radian);
	  double tangent=Math.tan(radian);
	  
	  //create an array to store these value
	  double[]trigonometricValue=new double[3];
	  
	  //store value manually in array
	  trigonometricValue[0]=sine;
	  trigonometricValue[1]=cosine;
	  trigonometricValue[2]=tangent;
	  
	  // return array trigonometricValue
	  
	  return trigonometricValue;
	  
	}
    // Method to display trigonometric values
    public void displayTrigonometricValue(double[] trigonometric) {
        System.out.println("Sine value     : " + trigonometric[0]);
        System.out.println("Cosine value   : " + trigonometric[1]);
        System.out.println("Tangent value  : " + trigonometric[2]);
    }
	
   public static void main(String[]args){
	   //initialise variables
	   double angle;
	   //create scanner object
	   Scanner input=new Scanner(System.in);
	   
	   //take angle from user
	    System.out.print("Enter angle in degrees: ");
	   angle=input.nextDouble();
	   
	   //create object of TrigonometricCalculation class
	   TrigonometricCalculation trigonometric=new TrigonometricCalculation();
	   
	   // Call calculation method and store returned array
        double[] result = trigonometric.calculateTrigonometricFunctions(angle);
	  
	    // Call display method
       trigonometric.displayTrigonometricValue(result);

        // Close scanner
        input.close();
   }


}

