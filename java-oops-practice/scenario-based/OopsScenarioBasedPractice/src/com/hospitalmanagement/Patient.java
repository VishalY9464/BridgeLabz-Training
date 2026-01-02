package com.hospitalmanagement;

public class Patient {
	
	//initiliaze instance variable
	public int patient_id;
	protected int age;
	protected String name;
	private String medicalHistory;
	
	//create constructor to initialize the variable for normal patient
	Patient(int patient_id,String name, int age){
		this.patient_id=patient_id;
		this.name=name;
		this.age=age;
	    this.medicalHistory = "Not Provided";
	}
	
	//create constructor to initialize variable for emergency patient
	Patient(int patient_id,String name, int age, String medicalHistory){
		this.patient_id=patient_id;
		this.name=name;
		this.age=age;
		this.medicalHistory=medicalHistory;
	}
	
	//create getter for medical history
	public String getMedicalHistory() {
		return medicalHistory;
	}
	
	//create setter for medical history
	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory=medicalHistory;
	}
	
	//method to display the detail of patient
	
	public void displayPatientDetail() {
		System.out.println("Patient_Id:" +patient_id);
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
	}
	
	

}
