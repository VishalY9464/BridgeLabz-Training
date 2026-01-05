package com.collegeinformationsystem;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String courseName;
	private Faculty faculty;
	private List<Student>students=new ArrayList<>();
	
    Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
    }
    
    void addStudent(Student s) {
        students.add(s);
    }
    
    void removeStudent(Student s) {
        students.remove(s);
    }

    

}
