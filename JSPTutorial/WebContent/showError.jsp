<%@ page isErrorPage="true" %>
<html>
<head>
<title>Show Error Page</title>
</head>
<!-- invoked from exceptionHandingExample.jsp if there is an error in that jsp -->
<body>
<h1>Oops...</h1>
<p>Sorry, an error occurred.</p>
<p>Here is the exception stack trace: </p>
<pre>
<% exception.printStackTrace(response.getWriter()); %>
</pre>
</body>
</html>