<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "com.purna.model.UserDetails"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
UserDetails userDetails = (UserDetails)session.getAttribute("userDetails");

%>

FullName <%=userDetails.getFullName() %><br>
Street <%=userDetails.getStreet() %><br>
City <%=userDetails.getCity() %><br>
Zip <%=userDetails.getZip() %><br>

</body>
</html>