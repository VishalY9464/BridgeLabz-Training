package com.hospitalmanagement;

public class Bill implements Payable {
	
	//initialise variable
	private double baseAmount;
	private double tax;
	private double discount;
	
	//create constructor to initialize variable
	Bill(double baseAmount, double tax, double discount){
		this.baseAmount=baseAmount;
		this.tax=tax;
		this.discount=discount;
	}
	
	//implement interface calculate payment method
	
	@Override
	public double calculatePayment() {
		double total_payment=baseAmount +tax-discount;
		return total_payment;
	}
	  public void generateBill(String patientName, String doctorName) {
	        System.out.println("----------------------------------------");
	        System.out.println("               HOSPITAL");
	        System.out.println("----------------------------------------");

	        System.out.println("Patient Name   : " + patientName);
	        System.out.println("Doctor         : " + doctorName);

	        System.out.println("\n----------------------------------------");
	        System.out.println("Treatment Details");
	        System.out.println("----------------------------------------");

	        System.out.println("Base Charge     : ₹" + baseAmount);
	        System.out.println("Tax             : ₹" + tax);
	        System.out.println("Discount        : ₹" + discount);

	        System.out.println("\n----------------------------------------");
	        System.out.println("Total Amount    : ₹" + calculatePayment());
	        System.out.println("----------------------------------------");
	        System.out.println("Thank you for visiting!");
	    }
          
}
