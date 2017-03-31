package com.purna.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if (userName != "" && userName != null) {

			session.setAttribute("savedUser", userName);
			context.setAttribute("savedUser", userName);
		}

		out.println("hello from GET method  " + userName);
		out.println("session saved the username as " + (String) session.getAttribute("savedUser"));
		out.println("context saved username as " + context.getAttribute("savedUser"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		String proffesion = request.getParameter("prof");
		String books[] = request.getParameterValues("books");

		out.println("hello from POST method your user name if " + userName + " and full name is " + fullName
				+ " you are a " + proffesion);
		for (int i = 0; i < books.length; i++) {
			out.println("you like " + books[i]);
		}

	}

}
