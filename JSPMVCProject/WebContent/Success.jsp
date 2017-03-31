<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.purna.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	You logged in successfully..

	<jsp:useBean id="user" class="com.purna.dto.User" scope="request">
	</jsp:useBean>
	Hello :
	<jsp:getProperty property="fullname" name="user" />


</body>
</html>