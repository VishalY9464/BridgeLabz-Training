package com.jdbc.establishconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnectionPattern {

    private static volatile SingletonConnectionPattern instance;
    private Connection connection;

    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Vishal@2004";

    // Private constructor
    private SingletonConnectionPattern() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connection successful");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(" MySQL Driver not found", e);
        } catch (SQLException e) {
            throw new RuntimeException(" Failed to connect to database", e);
        }
    }

    // Thread-safe Singleton
    public static SingletonConnectionPattern getInstance() {
        if (instance == null) {
            synchronized (SingletonConnectionPattern.class) {
                if (instance == null) {
                    instance = new SingletonConnectionPattern();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ✅ MAIN METHOD (NO TABLE INTERACTION)
    public static void main(String[] args) {

        SingletonConnectionPattern db = SingletonConnectionPattern.getInstance();

        Connection con = db.getConnection();

        try {
            if (con != null && !con.isClosed()) {
                System.out.println(" Application is connected to MySQL");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.closeConnection();
        }
    }
}
