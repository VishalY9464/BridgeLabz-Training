package com.collegeinformationsystem;

public class Person {
	
	//intance variable
	protected String name;
	protected String email;
	protected int id;
	
	//create constructor to initialise variable
	
	Person(String name, String email, int id){
		this.name=name;
		this.email=email;
		this.id=id;
	}
	
	//display the result
	public void printDetails() {
		System.out.println("Display the details");
	}

}
