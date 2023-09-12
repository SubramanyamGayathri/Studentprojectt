package com.servlet;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogServlet
 */
@WebServlet("/LogServlet")
public class LogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		
		RequestDispatcher rd = null;
		
		String Username ="";
		String Password = "";
		
		Username = request.getParameter("Uname");
		Password = request.getParameter("Pass");
		
		System.out.println("Username :"+Username);
		System.out.println("Password :"+Password);
		
		
		Query q = new Query();
		
		
		
		try {
			
			
			String result = q.Login(Username, Password);
			

			
			if(result.equals(Username))
			{
				System.out.println("Login Successful");
				session.setAttribute("label",Username);
				rd = request.getRequestDispatcher("./Home.jsp");
				rd.forward(request, response);
			}
			else
			{
				System.out.println("Login Failed");
				session.setAttribute("l", "Username or Password is Invalid");
				rd = request.getRequestDispatcher("./Log.jsp");
				rd.forward(request, response);
			}
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
