<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.Locale" %>
<%@ page import="javax.servlet.*,javax.servlet.http.* "%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h3>Internationalization Example</h3>
  <%
     //Get the client's Locale
     Locale locale = request.getLocale();
     String language = locale.getLanguage();
     String country = locale.getCountry();
  %>
  <p align="center">
  <% 
    out.println("Language : " + language  + "<br />");
    out.println("Country  : " + country   + "<br />");
  %>
  </p>
  
   <%
     // Set response content type
     response.setContentType("text/html");
     // Set spanish language code.
     response.setHeader("Content-Language", "es");
     String title = "En Español";

   %>
   
   <center>
     <h1><%  out.print(title); %></h1>
   </center>
   <div align="center">
    <p>En Español</p>
    <p>¡Hola Mundo!</p>
   </div>

</body>
</html>