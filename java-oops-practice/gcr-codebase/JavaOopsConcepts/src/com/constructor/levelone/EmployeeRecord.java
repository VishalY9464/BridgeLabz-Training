package com.constructor.levelone;

// Employee class
class Employee {

    // public variable
    public int employeeId;

    // protected variable
    protected String department;

    // private variable
    private double salary;

    // method to set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // method to get salary
    public double getSalary() {
        return salary;
    }
}

// Manager class (child class)
class Manager extends Employee {

    // constructor
    Manager(int employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    // display details
    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

// Main class
public class EmployeeRecord {

    public static void main(String[] args) {

        // create manager object
        Manager manager = new Manager(1, "Software Engineer");
        manager.display();

        // create employee object
        Employee employee = new Employee();
        employee.setSalary(67548392.0);

        System.out.println("Salary: " + employee.getSalary());
    }
}
