package com.jdbc.establishconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionBasic {

    
    static String url = "jdbc:mysql://localhost:3306/jdbc_db";
    static String username = "root";
    static String password = "Vishal@2004";

    static Connection con = null;

    public static Connection getConnection() {

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, username, password);

            System.out.println("Database connected successfully...");
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
        }
        catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }

        return con;
    }

    public static void main(String[] args) {

        Connection con = getConnection();

        if (con != null) {
            try {
                con.close();
                System.out.println("Connection closed!");
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
