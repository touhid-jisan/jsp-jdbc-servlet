<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page
	import="com.iclique.crudfull.userDAO.* , com.iclique.crudfull.model.*, java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<div align="right" style="margin:20px 650px ">
		<form action="HomeServlet?action=logout" method="post">
			<input type="submit" value="logout">
		</form>
	</div>
	<div align="center">
		<h3>Edit your profile</h3>
		<pre>
<form action="HomeServlet?action=update" method="post">

		  <input type="hidden" value="${user.getId()}" name="id"><br>
Name     :<input type="text" value='${user.getName() }' name="name"> <br>
Email    :<input type="text" value='${user.getEmail()}' name="email"> <br>
Country  :<input type="text" value="${user.getCountry()}" name="country"><br>
Contact  :<input type="text" value="${user.getContact()}" name="contact"><br>
Address  :<input type="text" value="${user.getAddress()}" name="address"><br>
		  <input type="submit" value="Submit"> 

</form>
</pre>
	</div>
</body>
</html>