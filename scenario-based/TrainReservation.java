//program for Train reservation system
import java.util.Scanner;
public class TrainReservation{
    public static void main(String[]args){
	
	    //create scanner object
		Scanner input=new Scanner(System.in);
		
	    //available seats
		int availableSeat=(int)(Math.random()*10)+1;
		
		//logic to book the seats
		while(availableSeat>0){
			 
			//enter optiion to proceed or exit 
			System.out.print("1-Book Ticekt"+"\n2-Exit");
			System.out.print("\nChoose Options:");
			int options=input.nextInt();
			
			//create switch case to choose option
		switch(options){
			case 1:
				    if(availableSeat>0){
						availableSeat--;
						System.out.println("Congratulations! Your ticket confirm:)");
						System.out.println("Total seat available: "+availableSeat);
					}else{
						System.out.println("Sorry! No seat available");
					}
                    break;
			case 2:
		            System.out.println("Thank you for ticket booking!");
					System.exit(0);
					break;
			default:
                    System.out.println("Invalid options choosen! Choose valid options");		     				
			}
			
		}
		        // When all seats are booked
        System.out.println("\n All seats are booked. Booking closed!");
		
	}
}