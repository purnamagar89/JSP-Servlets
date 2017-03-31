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
 * Servlet implementation class CookieGetterServlet
 */
@WebServlet("/CookieGetterServlet")
public class CookieGetterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieGetterServlet() {
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
			
			Cookie cookie = null;
			Cookie cookies[]=request.getCookies();
			
			if( cookies != null ){
		         out.println("<h2> Found Cookies Name and Value</h2>");
		         for (int i = 0; i < cookies.length; i++){
		            cookie = cookies[i];
		            out.print("Name : " + cookie.getName( ) + ",  ");
		            out.print("Value: " + cookie.getValue( )+" <br/>");
		         }
		      }else{
		          out.println(
		            "<h2>No cookies founds</h2>");
		      }
			
			
			
			//To delete cookies
			//1. Read an already exsiting cookie and store it in Cookie object.
			//2. Set cookie age as zero using setMaxAge() method to delete an existing cookie.
			//3. Add this cookie back into response header.
			
			 /*if( cookies != null ){
		         out.println("<h2> Cookies Name and Value</h2>");
		         for (int i = 0; i < cookies.length; i++){
		            cookie = cookies[i];
		            if((cookie.getName( )).compareTo("first_name") == 0 ){
		                 cookie.setMaxAge(0);
		                 response.addCookie(cookie);
		                 out.print("Deleted cookie : " + 
		                              cookie.getName( ) + "<br/>");
		            }
		            out.print("Name : " + cookie.getName( ) + ",  ");
		            out.print("Value: " + cookie.getValue( )+" <br/>");
		         }
		      }else{
		          out.println(
		            "<h2>No cookies founds</h2>");
		      }*/

			out.close();

		 }catch(Exception e){
			 System.out.println(e);
		  }
			
	}

}
