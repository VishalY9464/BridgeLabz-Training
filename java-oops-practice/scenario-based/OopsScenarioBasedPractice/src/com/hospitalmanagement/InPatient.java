package com.hospitalmanagement;

public class InPatient extends Patient {
	
      //initialize variable 
	  private int roomNumber;
	  private int daysAdmitted;
	  
	  // create constructor to initialize variable
	  InPatient(int patient_id, String name, int age, int roomNumber, int daysAdmitted){
		  super(patient_id, name,age); //call construtor of parent class
		  this.roomNumber=roomNumber;
		  this.daysAdmitted=daysAdmitted;
	  }
	  
	  //overide display method to display detail
	  @Override
	  public void displayPatientDetail() {
		 super.displayPatientDetail();
		 System.out.println("Room Number: "+roomNumber);
		 System.out.println("Days Admitted: "+daysAdmitted);
	  }
	  
	  

}
