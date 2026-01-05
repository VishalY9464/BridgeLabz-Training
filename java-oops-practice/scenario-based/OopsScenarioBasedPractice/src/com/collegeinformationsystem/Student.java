package com.collegeinformationsystem;

import java.util.ArrayList;
import java.util.List;

class Student extends Person implements ICourseActions {

    private int[] grades;
    private List<Course> courses = new ArrayList<>();

    Student(int id, String name, String email, int[] grades) {
        super(email, name, id);
        this.grades = grades;
    }

    public double calculateGPA() {
        int sum = 0;
        for (int g : grades) {
            sum += g;   // operator usage
        }
        return (double) sum / grades.length;
    }

    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    @Override
	public
    void printDetails() {
        System.out.println("Student: " + name + ", GPA: " + calculateGPA());
    }
}
