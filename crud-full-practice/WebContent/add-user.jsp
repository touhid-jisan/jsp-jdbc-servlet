<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("admin_name") == null) {
	response.sendRedirect("login.jsp");
}
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Progma", "no-cache");
response.setHeader("Expires" , "0");
%>
<div align="right" style="margin:20px 700px ">
		<form action="HomeServlet?action=logout" method="post">
			<input type="submit" value="logout">
		</form>
	</div>
	<div align="center">
		<form action="HomeServlet?action=insert" method="post" >
		<pre>
		 Name 	 : <input type="text" name="name"> <br>
		Email	: <input type="text" name="email"><br>
		Country : <input type="text" name="country"><br>
		Contact : <input type="number" name="contact"><br>
		Address : <input type="text" name="address"><br>
		<input type="submit" value="Submit">
		</pre>
		</form>
	</div>
</body>
</html>