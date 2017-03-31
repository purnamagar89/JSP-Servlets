<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h3>Use Bean Action Element</h3>
   <br>
   <jsp:useBean id="obj" class="com.company.java.Calculator"/>
   <p>The cube of 3 is <%= obj.cube(3) %>
   
   <jsp:useBean id="d" class="java.util.Date" /> 
	<p>The date/time is <%= d %>
</body>
</html>