package com.constructor.levelone;

// Student class
class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    // set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // get CGPA
    public double getCGPA() {
        return CGPA;
    }
}

// Child class
class PostgraduateStudent extends Student {

    PostgraduateStudent(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

// Main class
public class UniversityManagementSystem {

    public static void main(String[] args) {

        PostgraduateStudent student = new PostgraduateStudent(101, "Rahul");

        student.display();

        student.setCGPA(8.7);
        System.out.println("CGPA: " + student.getCGPA());
    }
}
