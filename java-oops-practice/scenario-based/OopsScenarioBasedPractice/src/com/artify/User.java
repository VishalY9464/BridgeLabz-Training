package com.artify;

public class User {
	//create instance variable
	private String name;
	private double walletBalance;
	
	//create construtor for instance variable
	public User(String name, double walletBalance) {
		this.name=name;
		this.walletBalance=walletBalance;
	}
	
	//create method for getWalletBalance
	public double getWalletBalance() {
		return walletBalance;
	}
	
	//create method for deduct Amount
	public void deductAmount(double amount) {
		walletBalance-=amount;
		System.out.println(amount + " deducted. Remaining balance: " + walletBalance);
		
	}

}
