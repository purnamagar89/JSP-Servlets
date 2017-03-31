package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ldo.Student;

public class StudentDao {

	JdbcConnection jc = new JdbcConnection();
	Connection connection = jc.getConnection();

	public List<Student> getStudents() {

		String query = "select * from student";
		List<Student> list = new ArrayList<Student>();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {

				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setFirstName(rs.getString(2));
				student.setLastName(rs.getString(3));
				student.setGrade(rs.getInt(4));
				student.setEmail(rs.getString(5));
				list.add(student);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int createStudent(Student s) {

		String query = "insert into student(firstName,lastName,grade,email) values(?,?,?,?)";
		int i = 0;
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, s.getFirstName());
			ps.setString(2, s.getLastName());
			ps.setInt(3, s.getGrade());
			ps.setString(4, s.getEmail());
			i = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

}
