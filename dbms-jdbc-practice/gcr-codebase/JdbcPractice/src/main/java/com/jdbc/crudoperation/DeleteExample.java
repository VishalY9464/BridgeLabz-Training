package com.jdbc.crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteExample {
	
	public static void deleteStudent(int id) {
		String sql="DELETE FROM student WHERE id=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Vishal@2004");
			PreparedStatement psmt= conn.prepareStatement(sql);
			psmt.setInt(1, id);
			
			int rowaffected=psmt.executeUpdate();
			System.out.println(rowaffected+" deleted successfully");
			conn.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		deleteStudent(3);
	}

}
