<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <!-- out -->
  <% out.print("Today is: "+java.util.Calendar.getInstance().getTime()); %>
  <br/>
  <!-- request -->
  <% String name = request.getParameter("uname");
     out.print("Welcome "+name);   
  %>
  <br/>
  <!-- response -->
  <%-- <% response.sendRedirect("http://www.google.com"); %> --%>
</body>
</html>