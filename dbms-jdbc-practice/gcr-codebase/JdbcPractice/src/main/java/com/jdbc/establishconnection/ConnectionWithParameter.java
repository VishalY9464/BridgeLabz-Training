package com.jdbc.establishconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DataBaseConfiguration {

    public static Connection getConnection() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/jdbc_db";

        java.util.Properties properties = new java.util.Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "Vishal@2004");
        properties.setProperty("useSSL", "false");
        properties.setProperty("serverTimezone", "UTC");
        properties.setProperty("allowPublicKeyRetrieval", "true");

        return DriverManager.getConnection(url, properties);
    }
}
public class ConnectionWithParameter {
	public static void main(String[] args) {
		
		try {
			Connection con=DataBaseConfiguration.getConnection();
			System.out.println("Connection Successfully..");
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
