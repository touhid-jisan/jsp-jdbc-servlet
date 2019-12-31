<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*, com.iclique.jsp.students.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	List<Student> students = new ArrayList<Student>();
	students.add(new Student("Touhid", "Jisan", true));
	students.add(new Student("Skaib", "Quader", false));
	students.add(new Student("Isra", "Binte", true));

	pageContext.setAttribute("allStudents", students);
%>


<body>
	<table border="1px">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gender Name</th>
			<th>First Name Length</th>
			<th>Name Upper case</th>
			<th>Name Starts with "I"</th>
		</tr>

		<c:forEach var="tempStudent" items="${allStudents}">
			<tr>
				<td>${tempStudent.fName}</td>
				<td>${tempStudent.lName}</td>
				<td><c:choose>
						<c:when test="${tempStudent.goldCustomer}"> Special Discount</c:when>
						<c:otherwise>No Discount</c:otherwise>
					</c:choose></td>
				<td><c:set var="findLength" value="${tempStudent.fName}" />${fn:length(findLength)}
				</td>
				<td><c:set var="makeUpperCase" value="${tempStudent.fName}" />
					${fn:toUpperCase(makeUpperCase)}</td>
				<td><c:set var="checkFname" value="${tempStudent.fName}" />${fn:startsWith(checkFname, "I")}</td>
			</tr>
		</c:forEach>

	</table>
	<br>
	<br>
	<hr>
	<br>
		<c:set var="name" value="touhidul*islam*jisan"/>
		<c:set var="splitName" value="${fn:split(name, '*')}"/>
		
		<c:forEach var="tempName" items="${splitName}"> ${tempName }<br></c:forEach>
		<hr>
		<c:set var="joinName" value="${fn:join(splitName, ' ')}"/> ${joinName}
	<hr>
	<br>
	<br>

</body>
</html>