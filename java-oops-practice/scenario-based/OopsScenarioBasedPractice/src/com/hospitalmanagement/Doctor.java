package com.hospitalmanagement;

public class Doctor {
	 
	//initialize variable
	private int doctor_id;
	private String name;
	private String specialization;
	
	//create constructor to initialize variable
	Doctor(int doctor_id,String name, String specialization){
		this.doctor_id=doctor_id;
		this.name=name;
		this.specialization=specialization;
	}
	
	//method to display doctor detail
	public void displayDoctorDetail() {
		System.out.println("Doctor_Id: "+doctor_id);
		System.out.println("Doctor Name: "+name);
		System.out.println("Specialization : "+specialization);
	}

}
