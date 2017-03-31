package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.ldo.Student;

@WebServlet("/student")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	StudentDao studentDao = new StudentDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Student> list = studentDao.getStudents();

		request.getSession().setAttribute("students", list);
		response.sendRedirect("students");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Student student = new Student();

		student.setFirstName(request.getParameter("fname"));
		student.setLastname(request.getParameter("lname"));
		student.setGrade(Integer.parseInt(request.getParameter("grade")));
		student.setEmail(request.getParameter("email"));

		int j = studentDao.createStudent(student);
		if (j > 0) {
			out.println(j + "record inserted successfully.. ");
		}else{
			out.println("failed to insert record..");
			
		}

	}

}
