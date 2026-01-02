package com.hospitalmanagement;

public class OutPatient extends Patient {
	
	  //initialize variable 
	  private String visitDate;
	  private double consultationFee;
	  
	  // create constructor to initialize variable
	  OutPatient(int patient_id, String name, int age, String visitDate, double consultationFee){
		  super(patient_id, name,age); //call construtor of parent class
		  this.visitDate=visitDate;
		  this.consultationFee=consultationFee;
	  }
	  
	  //overide display method to display detail
	  @Override
	  public void displayPatientDetail() {
		 super.displayPatientDetail();
		 System.out.println("visitDate: "+visitDate);
		 System.out.println("consultation fee: "+consultationFee);
	  }

}
