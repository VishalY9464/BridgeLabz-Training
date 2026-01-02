package com.hospitalmanagement;

public class HospitalApp {
	  public static void main(String[] args) {

	     //   Patient p1 = new InPatient(101, "Amit", 30, 201, 4);
	        Patient p2 = new OutPatient(102, "Riya", 22 ,"10-Apr-2026", 500);

	        Doctor d1 = new Doctor(1, "Dr. Sharma", "Cardiologist");
	        

	        Bill bill = new Bill(2000, 200, 150);

	        p2.displayPatientDetail();
	        System.out.println();

//	        p1.displayPatientDetail();
//	        System.out.println();

	        d1.displayDoctorDetail();
	        System.out.println();
	        
	        bill.generateBill(" Riya", "Dr. Sharma");
	        
	    }

}
