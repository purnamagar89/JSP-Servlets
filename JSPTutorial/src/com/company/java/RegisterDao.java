package com.company.java;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDao {
	public static int register(UserRegistration u){
		int status=0;
		try{
			System.out.println("Register DAO");
			Connection con=ConnectionProvider.getCon();

            PreparedStatement ps=con.prepareStatement("insert into players (ID,FirstName,LastName,Age) values(?,?,?,?)");
			ps.setInt(1, u.getId());
            ps.setString(2,u.getFirstname());
			ps.setString(3,u.getLastname());
			ps.setInt(4,u.getAge());
			
			status=ps.executeUpdate();
			System.out.println("status:"+status);
		}catch(Exception e){}
		
		return status;
	}
}
