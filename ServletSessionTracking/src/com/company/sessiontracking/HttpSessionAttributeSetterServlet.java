package com.company.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HttpSessionAttributeSetterServlet
 */
@WebServlet("/HttpSessionAttributeSetterServlet")
public class HttpSessionAttributeSetterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpSessionAttributeSetterServlet() {
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
			
			String n=request.getParameter("userName");
			out.print("Welcome "+n);
			out.print("<br>");
			
			HttpSession session=request.getSession();
			session.setAttribute("uname",n);

			out.print("<a href='httpSessionAttributeGetter'>Visit HTTP Session Getter Servlet</a>");
					
			out.close();

	    }catch(Exception e){
	    	System.out.println(e);
	    }
	}

}
