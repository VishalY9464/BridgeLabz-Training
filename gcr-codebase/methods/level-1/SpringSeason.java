//program SpringSeason that takes two int values month and day from the command line

public class SpringSeason{
      public static boolean isSpringSeason(int day,int month){
	   //check spring season
	   if((month==3 && day>=20) || (month>3 && month<6) || (month==6 && day<=20)){
	        return true;
	   }else{
	    return false;
	   }
	  
	  }
  public static void main(String[]args){
     
	  //initialise day and month
	  int day=Integer.parseInt(args[0]);
	  int month=Integer.parseInt(args[1]);
	  
	  //display the result of spring season
	  
	  if(isSpringSeason(day,month)){
	      System.out.println("Yes, this is spring season");
	  }else{
	        System.out.println("No, this is not spring season");
	      }
	  
	  
  
  }
}