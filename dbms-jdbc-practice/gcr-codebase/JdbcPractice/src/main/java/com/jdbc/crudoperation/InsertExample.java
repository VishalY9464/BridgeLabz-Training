package com.jdbc.crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {

    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Vishal@2004";

    public static void insertStudent(String name, String email, int age, String grade) {

        String sql = "INSERT INTO student (name, email, age, grade, enrollment_data) VALUES (?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement psmt = con.prepareStatement(sql)) {
            	 Statement smt=con.createStatement();
            	

                psmt.setString(1, name);
                psmt.setString(2, email);
                psmt.setInt(3, age);
                psmt.setString(4, grade);
                psmt.setDate(5, new java.sql.Date(System.currentTimeMillis()));

                int rowsAffected = psmt.executeUpdate();
                System.out.println(rowsAffected + " row inserted successfully");

            }

        } catch (ClassNotFoundException e) {
            System.out.println(" MySQL Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println(" Database operation failed");
            e.printStackTrace();
        }
    }

    // ✅ MAIN METHOD (Runnable)
    public static void main(String[] args) {

        insertStudent("Vishal", "vishal@gmail.com", 19, "A+");
        insertStudent("Vikash", "vikash@gmail.com", 20, "A");
        insertStudent("Virendra", "virendra@gmail.com", 22, "A+");

        System.out.println("Insert operations completed");
    }
}
