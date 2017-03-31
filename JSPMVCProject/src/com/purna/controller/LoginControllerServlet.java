package com.purna.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.purna.service.LoginService;
import com.purna.dto.User;

@WebServlet("/login")
public class LoginControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		LoginService service = new LoginService();
		boolean result = service.authentication(userName, password);

		if (result) {
			User user = service.getUserDetails(userName);
			// request.getSession().setAttribute("savedUser", user);
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Success.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("Login.jsp");
		}
	}

}
