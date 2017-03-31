package com.company.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddenFormFieldSetterServlet
 */
@WebServlet("/HiddenFormFieldSetterServlet")
public class HiddenFormFieldSetterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HiddenFormFieldSetterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String userName = request.getParameter("userName");
			out.print("Welcome "+userName);
			
			//creating form that have invisible textfield
			out.print("<form action='hiddenFormFieldGetter'>");
			out.print("<input type='hidden' name='uname' value='"+userName+"'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");
			
			out.close();

	     }catch(Exception e){
	    	 System.out.println(e);
	     }
	}

}
