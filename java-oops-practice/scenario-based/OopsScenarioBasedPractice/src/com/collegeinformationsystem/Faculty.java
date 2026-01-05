package com.collegeinformationsystem;

public class Faculty extends Person {
	  private String department;

	    Faculty(int id, String name, String email, String department) {
	        super(email, name, id);
	        this.department = department;
	    }

	    @Override
		public
	    void printDetails() {
	        System.out.println("Faculty: " + name + ", Dept: " + department);
	    }
	

}
