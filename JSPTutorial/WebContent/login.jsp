<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h4>Login Page</h4>
  <%
    if(request.getAttribute("error")!=null){
    out.print("Not valid user! Try again<hr>");
   }
  %>

<form action="controllerServlet">
  Name:<input type="text" name="name"/><br/><br>
  Password:<input type="password" name="pass"/><br/>

  <input type="submit" value="Login"/>

</form>

</body>
</html>