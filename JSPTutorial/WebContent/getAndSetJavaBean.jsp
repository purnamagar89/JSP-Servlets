<html>
<head>
<title>get and set properties Example</title>
</head>
<body>

<jsp:useBean id="user" 
                    class="com.company.java.User"> 
   <jsp:setProperty name="user" property="name"
                    value="Praveen"/>
   <jsp:setProperty name="user" property="email" 
                    value="praveen@gmail.com"/>
</jsp:useBean>

<p>User Name: 
   <jsp:getProperty name="user" property="name"/>
</p>
<p>User Email: 
   <jsp:getProperty name="user" property="email"/>
</p>

</body>
</html>