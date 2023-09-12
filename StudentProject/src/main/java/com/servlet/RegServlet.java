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
 * Servlet implementation class RegLogServlet
 */
@WebServlet("/RegLogServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		RequestDispatcher rd = null;
		
		String Username ="";
		String Password="";
		String Email="";
		String Phone_Number="";
		String Gender="";
		String UserType="";
		
		Username = request.getParameter("Uname");
		Password = request.getParameter("Pass");
		Email = request.getParameter("Email");
		Phone_Number = request.getParameter("Phone");
		Gender = request.getParameter("Gender");
		UserType = request.getParameter("Utype");
		
		System.out.println("Username :"+Username);
		System.out.println("Pasword :"+Password);
		System.out.println("Email :"+Email);
		System.out.println("PhoneNumber :"+Phone_Number);
		System.out.println("Gender :"+Gender);
		System.out.println("UserType :"+UserType);
		
		
		
		Query q = new Query();
		
		int result=0;
		
		try {
			
			result = q.register(Username, Password, Email, Phone_Number, Gender, UserType);
			System.out.println(Username);
			
			if(result > 0)
			{
				System.out.println("Registration Successful");
				rd = request.getRequestDispatcher("./Log.jsp");
				rd.forward(request, response);
			}
			else
			{
				System.out.println("Not Registered");
				rd = request.getRequestDispatcher("./Reg.jsp");
				rd.forward(request, response);
			}
			
			
			
			
			
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
