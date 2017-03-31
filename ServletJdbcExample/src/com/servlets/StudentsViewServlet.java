package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ldo.Student;

/**
 * Servlet implementation class StudentsServlet
 */
@WebServlet("/students")
public class StudentsViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		List<Student> students = (ArrayList<Student>) request.getSession().getAttribute("students");

		out.println("<table>" + "<tr>" + "<td>Id<td>" + "<td>FirstName<td>" + "<td>LastName<td>" + "<td>Grade<td>"
				+ "<td>Email<td>" + "</tr>");

		for (Student s : students) {
			out.println(
					"<tr>" + "<td>" + s.getId() + "<td>" + "<td>" + s.getFirstName() + "<td>" + "<td>" + s.getLastname()
							+ "<td>" + "<td>" + s.getGrade() + "<td>" + "<td>" + s.getEmail() + "<td>" + "</tr>");

		}
		out.println("</table>");

	}

}
