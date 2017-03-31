<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



<%
String userName = request.getParameter("name");
if(userName!="" && userName !=null){
	
	session.setAttribute("savedUser", userName);
	application.setAttribute("savedUser", userName);
}

%>
UserName in request object : <%=userName %><br>
UserName in session object : <%=session.getAttribute("savedUser") %><br>
UserName in application object : <%=application.getAttribute("savedUser") %>


</body>
</html>