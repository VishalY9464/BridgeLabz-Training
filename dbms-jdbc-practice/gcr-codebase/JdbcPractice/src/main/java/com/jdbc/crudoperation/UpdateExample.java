package com.jdbc.crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateExample {
	
	public static void updateStudent(int id, String name) {
		String sql="UPDATE student SET name=? WHERE id=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Vishal@2004");
			PreparedStatement psmt= conn.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setInt(2, id);
			
			int rowAffected=psmt.executeUpdate();
			System.out.println(rowAffected+" Update succefully!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		updateStudent(1, "Vishal Yadav");
	}

}
