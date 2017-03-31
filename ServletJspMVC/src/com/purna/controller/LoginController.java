package com.purna.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.purna.model.LoginModel;
import com.purna.model.UserDetails;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		

		if (!username.equals(null) && !username.equals("")) {
			HttpSession session = request.getSession();
			session.setAttribute("name", username);

		}
		LoginModel lm = new LoginModel();

		boolean isValid = lm.validate(username, password);

		if (isValid) {

			UserDetails userDetails = lm.getUserDetails();
			request.getSession().setAttribute("userDetails", userDetails);
			response.sendRedirect("success.jsp");
			return;
		} else {

			response.sendRedirect("login.jsp");
			return;
		}

	}

}
