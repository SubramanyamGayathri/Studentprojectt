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
 * Servlet implementation class DelServlet
 */
@WebServlet("/DelServlet")
public class DelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request , HttpServletResponse responce)
	{
		HttpSession session = request.getSession();
		
		RequestDispatcher rd = null;
		
		String Rollno ="";
		Rollno = request.getParameter("Rollno");
		
		System.out.println("Rollno :"+Rollno);
		
		Query q = new Query();
		
		int result =0;
		try
		{
			result = q.Delete(Rollno);
			
			
			if(result > 0)
			{
				System.out.println("Deleted Successfully");
				rd = request.getRequestDispatcher("./DeleteWelcome.html");
				rd.forward(request, responce);
			}
			else
			{
				System.out.println("Failed Attempt");
				rd = request.getRequestDispatcher("./Delete.jsp");
				rd.forward(request, responce);
			}
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
    

}
