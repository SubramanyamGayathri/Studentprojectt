package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UpdateServ
 */
@WebServlet("/UpdateServ")
public class UpdateServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		RequestDispatcher rd = null;
		
		String Marks ="";
		String Rollno="";
		
		Marks = request.getParameter("Marks");
		Rollno = request.getParameter("Rollno");
		
		System.out.println("Marks :"+Marks);
		System.out.println("RollnNo :"+Rollno);
		
		
		Query q = new Query();
		
		int result=0;
		
		try
		{
			 result = q.update(Marks, Rollno);
			
			if(result > 0)
			{
				System.out.println("Update Successful");
				rd = request.getRequestDispatcher("./UpdateWelcome.html");
				rd.forward(request, response);
			}
			else
			{
				System.out.println("Update Failed");
				rd = request.getRequestDispatcher("./Update.jsp");
				rd.forward(request, response);
				
			}

		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
