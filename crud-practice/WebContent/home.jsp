<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page
	import="com.iclique.crud.DAO.UserDAO,java.util.*,com.iclique.crudfull.model.User"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body>
	<%
		List<User> list = UserDAO.listAllUsers();
		request.setAttribute("listUsers", list);
	%>
<div align="center" style="margin-top:50px"">
	<a href="add-user.jsp"> Add New User</a>
	<table border="1px solid" align="center" style="margin-top: 25px">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Country</th>
		</tr>
		<c:forEach var="user" items="${listUsers}">
			<tr>
				<td><c:out value="${user.getId()}"></c:out></td>
				<td><c:out value="${user.getName()}"></c:out></td>
				<td><c:out value="${user.getEmail()}"></c:out></td>
				<td><c:out value="${user.getCountry()}"></c:out></td>
				
			</tr>
		</c:forEach>
	</table>
	
</div>
</body>
</html>
