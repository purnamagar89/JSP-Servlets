<%@ page contentType="text/html; charset=" %><%@ page contentType="text/html; charset=" %><%@ page contentType="text/html; charset=" %><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <%
     session.setAttribute("user", "rchintala");
   %>
   <form action="expressionLanguageProcess.jsp">
      Enter Name: <input name="name" type="text">
      <br>
      <br>
      <input type="submit" value="Go">
   </form>
</body>
</html>