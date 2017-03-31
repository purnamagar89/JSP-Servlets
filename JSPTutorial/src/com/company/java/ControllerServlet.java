package com.company.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6238787769840117868L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			response.setContentType("text/html");
			//PrintWriter out = response.getWriter();
				
			String name=request.getParameter("name");
			String password=request.getParameter("pass");
				
			if(name==null){
				RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");
				rd.forward(request, response);
			}
			else if(name.equals("praveen") && password.equals("praveen")){
				RequestDispatcher rd=request.getRequestDispatcher("/welcomeUser.jsp");
				rd.forward(request, response);
			}
			else{
				request.setAttribute("error","true");
				RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");
				rd.forward(request, response);

			}
			
			
			//out.close();
			}
}
