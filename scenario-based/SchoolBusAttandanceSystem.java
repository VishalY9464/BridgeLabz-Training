

import java.util.Scanner;
public class SchoolBusAttandanceSystem{
    public static void main(String[]args){
		
	    //create scanner object
		Scanner input=new Scanner(System.in);
		
		//Number of present students
		int presentStudent=0;
		//Number of Absent Students;
		int absentStudent=0;
		
		String[]students={
			"Vikash","Vishal","Virendra","Vipul","Vipin","Vimal",
			"Viraj","Vinay","Virat","Veeru"
		};
		for(String student:students){
			//ask for present or Absent
			
			System.out.println("Is "+ student +" present? ");
			String studentResponse=input.next().toLowerCase();
			if(studentResponse.equals("yes")){
			    System.out.println("Student "+student+" Present ");
				presentStudent++;
			}
			else{
				System.out.println("Student "+student+" Absent ");
				absentStudent++;
			}
			
		}
		
		System.out.println("Total Present Student:"+ presentStudent +"\nTotal Absent Student: "+ absentStudent);
		
		
	
	}

}