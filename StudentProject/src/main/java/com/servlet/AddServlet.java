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
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		RequestDispatcher rd = null;
		
		String Sname = "";
		String Branch ="";
		String Rollno = "";
		String Marks ="";
		
		Sname = request.getParameter("Sname");
		Branch = request.getParameter("Branch");
		Rollno = request.getParameter("Rollno");
		Marks = request.getParameter("Marks");
		
		System.out.println("Student Name :"+Sname);
		System.out.println("Branch :"+Branch);
		System.out.println("Rollno :"+Rollno);
		System.out.println("Marks :"+Marks);
		
		Query q = new Query();
		
		int result =0;
		
		try {
			
		result = q.Add(Sname, Branch, Rollno, Marks);
		
		if(result > 0)
		{
			System.out.println("New Data is Added");
			rd = request.getRequestDispatcher("./Read.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("Insertion Failed..!");
			rd = request.getRequestDispatcher("./Error.html");
			rd.forward(request, response);
		}
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
