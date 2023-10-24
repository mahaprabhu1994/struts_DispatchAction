package com.action.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {
	
	//save method
	public int save(int id, String name, String email, float  salary, long phone) throws Exception{
		
		 String  dburl = "jdbc:mysql://localhost:3306/employee";
		 String dbuname = "root";
		 String dbpassword = "maniharish";
		 String dbdriver = "com.mysql.jdbc.Driver";

		 		Class.forName(dbdriver);
				Connection con = DriverManager.getConnection(dburl,dbuname,dbpassword);
				PreparedStatement ps = con.prepareStatement("insert into employee_reg values(?,?,?,?,?)");
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, email);
				ps.setFloat(4,salary);
				ps.setLong(5, phone);
				
				int i=ps.executeUpdate();
				con.close();
				return i;		
	}
	
	//update method
	public int update(int id, String name, String email, float  salary, long phone) throws Exception{
		
		 String  dburl = "jdbc:mysql://localhost:3306/employee";
		 String dbuname = "root";
		 String dbpassword = "maniharish";
		 String dbdriver = "com.mysql.jdbc.Driver";

		 		Class.forName(dbdriver);
				Connection con = DriverManager.getConnection(dburl,dbuname,dbpassword);
				PreparedStatement ps = con.prepareStatement("update employee_reg set name=?, email=?, salary=?,phonono=? where  id=?");
				
				ps.setString(1, name);
				ps.setString(2, email);
				ps.setFloat(3,salary);
				ps.setLong(4, phone);
				ps.setInt(5, id);
				int i=ps.executeUpdate();
				con.close();
				return i;		
	}
}
