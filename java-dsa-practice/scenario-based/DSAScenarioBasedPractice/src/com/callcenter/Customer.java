package com.callcenter;

public class Customer {
	
	//instance variable
	public int id;
	public String name;
	boolean isVIP;
	
	//create constructor to initialise variable
	public Customer(int id, String name, boolean isVIP) {
		this.id = id;
		this.name = name;
		this.isVIP = isVIP;
	}

}
