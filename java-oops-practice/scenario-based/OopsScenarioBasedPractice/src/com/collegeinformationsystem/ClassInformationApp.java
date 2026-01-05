package com.collegeinformationsystem;

public class ClassInformationApp {
	public static void main(String[] args) {
		Person p1 = new Student(1, "Vishal", "v@gmail.com", new int[]{8,9,7});
		Person p3 = new Student(1, "Vikash", "v@gmail.com", new int[]{9,9,7});
		Person p4 = new Student(1, "Virendra", "v@gmail.com", new int[]{8,9,9});
		Person p5 = new Student(1, "Anuj", "v@gmail.com", new int[]{8,8,7});
		Person p2 = new Faculty(101, "Dr. Sharma", "s@gmail.com", "CSE");

		p1.printDetails(); // Student logic
		p3.printDetails();
		p4.printDetails();
		p5.printDetails();
	
		p2.printDetails(); // Faculty logic

	}

}
