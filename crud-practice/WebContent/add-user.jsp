<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
<form action="AddServlet?action=new" method="post">
<pre>
	Enter Name  	:<input type="text" name="name"><br>
	Enter Email 	:<input type="text" name="email" > <br>
	Enter Country	:<input type="text" name="country"><br>
	<input type="submit" value="Submit">
</pre>
</form>
</body>
</html>