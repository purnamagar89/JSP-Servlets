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
 * Servlet implementation class HttpSessionAttributeGetterServlet
 */
@WebServlet("/HttpSessionAttributeGetterServlet")
public class HttpSessionAttributeGetterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpSessionAttributeGetterServlet() {
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
			
			HttpSession session=request.getSession(false);
			String n=(String)session.getAttribute("uname");
			out.print("Hello "+n);

			out.close();

	     }catch(Exception e){System.out.println(e);}
	}

}
