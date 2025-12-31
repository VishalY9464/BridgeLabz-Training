//program for Digital Watch simulation

public class DigitalWatch{
    public static void main(String[]args){
		
		//use labelto break the program
		watch:
		
		for(int hh=0;hh<23;hh++){
			for(int mm=0;mm<59;mm++){
				
				System.out.printf("%02d:%02d%n",hh,mm);
				
				//simulate power cut at 13:00
				if(hh==13 && mm==00){
					System.out.println("Power cut occured at 13:00");
					break watch;
				}
			}
		}
	}
}