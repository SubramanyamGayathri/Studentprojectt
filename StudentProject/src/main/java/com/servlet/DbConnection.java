package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		String url ="jdbc:mysql://localhost:3306/";
		String uname ="root";
		String Pass = "";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, Pass);
		return con;
	}

}
