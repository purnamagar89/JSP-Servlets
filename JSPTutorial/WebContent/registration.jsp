<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h3>Registration Page</h3>
  <form action="registrationSuccess.jsp">
		<input type="text" name="id" value="ID..." onclick="this.value=''"/><br/>
	<input type="text" name="firstname"  value="FName..." onclick="this.value=''"/><br/>
	<input type="text" name="lastname"  value="LName..." onclick="this.value=''"/><br/>
	<input type="text" name="age"  value="Age..." onclick="this.value=''"/><br/>
	<input type="submit" value="register"/>
  </form>
</body>
</html>