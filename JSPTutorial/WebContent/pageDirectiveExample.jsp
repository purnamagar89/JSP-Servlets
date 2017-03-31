<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h3>Page Directive Example</h3>
   <!-- Import attribute -->
   <%@ page import="java.util.Date" %>
   Today is: <%= new Date() %>
   <br/>
   
   <!-- contentType attribute -->
   <%@ page contentType="text/html; charset=ISO-8859-1"%>
   Today is: <%= new java.util.Date() %>
   <br/>   
   
   <!-- info attribute -->
   <%@ page info="composed by Praveen" %>  
   <%= getServletInfo() %>
   <br/>
   
   <!-- buffer attribute -->
   <%@ page buffer="16kb" %>
   Today is: <%= new java.util.Date() %>
   <br/> 
   
   <!-- language attribute -->
   <%@ page language="java" %>
   
   <!-- isELIgnored attribute -->
   <%@ page isELIgnored="false" %>
   
   <!-- isThreadSafe attribute -->
   <%@ page isThreadSafe="true" %>
   
   <!-- errorPage attribute -->
   <%@ page errorPage="error.jsp"%>
   <%= 100/0 %>  
   
   <!-- isErrorPage attribute -->
   <%@ page isErrorPage="false"%>
   
   
</body>
</html>