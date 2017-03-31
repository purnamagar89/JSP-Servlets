package com.company.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieSetterServlet
 */
@WebServlet("/CookieSetterServlet")
public class CookieSetterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieSetterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
				
			String userName = request.getParameter("userName");
			out.print("Welcome "+userName);

			Cookie ck=new Cookie("uname",userName);//creating cookie object
		    response.addCookie(ck);//adding cookie in the response

			//creating submit button
			out.print("<form action='cookieGetter' method='post'>");
			out.print("<input type='submit' value='Go'>");
			out.print("</form>");
				
			out.close();

		   }catch(Exception e){
			   System.out.println(e);
		    }
	}

}
