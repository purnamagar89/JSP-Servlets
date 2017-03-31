<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.ldo.Student"%>
<%@ page import="java.util.ArrayList" import="java.util.List"
	import="com.ldo.Student"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="studentDao" class="com.dao.StudentDao"></jsp:useBean>
	<%
		List<Student> students = (ArrayList<Student>) studentDao.getStudents();
		session.setAttribute("students", students);
	%>

	<table>
		<tr>
			<td>Id
			<td>
			<td>FirstName
			<td>
			<td>LastName
			<td>
			<td>Grade
			<td>
			<td>Email
			<td>
		</tr>

		<c:forEach items="${students}" var="s">
			<tr>

				<td><c:out value="${s.getId()}"></c:out>
				<td>
				<td><c:out value="${s.getFirstName()}"></c:out>
				<td>
				<td><c:out value="${s.getLastName()}"></c:out>
				<td>
				<td><c:out value="${s.getGrade()}"></c:out>
				<td>
				<td><c:out value="${s.getEmail()}"></c:out>
				<td>
			</tr>

		</c:forEach>
	</table>

</body>
</html>