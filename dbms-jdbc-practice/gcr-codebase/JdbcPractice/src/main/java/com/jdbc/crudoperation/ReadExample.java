package com.jdbc.crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadExample {
	
	
	public static void readValue() throws ClassNotFoundException {
	String sql="SELECT *FROM student";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Vishal@2004");
		PreparedStatement psmt=conn.prepareStatement(sql);
		ResultSet rs=psmt.executeQuery();
		
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String email=rs.getString("email");
			int age=rs.getInt("age");
			String grade=rs.getString("grade");
			
			System.out.println(id+", "+name+","+age+", "+email+","+grade);
			
		}
	}
	catch(SQLException e){
		System.out.println(e.getMessage());
	}
	
}
  public static void main(String[] args) throws ClassNotFoundException {
	readValue();
}

}
