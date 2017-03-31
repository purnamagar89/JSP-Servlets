<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.ldo.Student"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="studentDao" class="com.dao.StudentDao"></jsp:useBean>
	<jsp:useBean id="student" class="com.ldo.Student"></jsp:useBean>
	<jsp:setProperty property="*" name="student" />

	<%
		int i = studentDao.createStudent(student);
	session.setAttribute("i", i);
	%>
	<c:if test="${i>0}">
		<p>record inserted successfully..</p>
	</c:if>
	<c:if test="${i==0}">
		<p>failed to insert record...</p>
	</c:if>



</body>
</html>