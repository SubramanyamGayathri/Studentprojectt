package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = null;
	
		String Uname="";
		Uname = request.getParameter("Uname");
		System.out.println("Username :"+Uname);
		try(PrintWriter out = response.getWriter())
		{
			
			try {
			String url="jdbc:mysql://localhost:3306/Backend_data";
			String name="root";
			String pass="Sajjanar@123";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,name,pass);
			String qry ="select * from Student where Sname = ?";
			PreparedStatement ps = con.prepareStatement(qry);
			
			ps.setString(1,Uname);
			out.print("<table width =50% border = 1>");
			out.print("<caption>Student Details :</caption>");
			
			ResultSet rs = ps.executeQuery();
			out.print("<br><br>");
			ResultSetMetaData  rsmd = rs.getMetaData();
			int total = rsmd.getColumnCount();
			
			out.print("<tr>");
			for(int i =1;i<=total;i++)
			{
				out.print ("<th>" + rsmd.getColumnName (i) + "</th>");
			}
			out.print("</tr>");
			
			while(rs.next())
			{
				 out.print ("<tr><td>" + rs.getString (1) + "</td><td>" +  rs.getString (2) + " </td><td>" + rs.getString (3) + " </td><td>" + rs.getString (4) + "</td></tr>");
			}
			
			out.print("</tables>");
			
		}
			catch(Exception e1)
		{
			System.out.println(e1);
		}
		finally
		{
			out.close();		
		}
	}

}
}
