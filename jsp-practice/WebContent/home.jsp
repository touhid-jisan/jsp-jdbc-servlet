<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.html"></jsp:include>
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<form action="student-response.jsp">
		First Name : <input type="text" name="fName"> <br /> <br />
		Last Name : <input type="text" name="lName"> <br /> <br /> 
		Country : <select name="country">
			<option>BD</option>
			<option>Canada</option>
			<option>USA</option>
		</select> <br><br>
		
		<input type="checkbox" name="codeLanguage" value="JAVA"> JAVA 
		<input type="checkbox" name="codeLanguage" value="php"> php
		<input type="checkbox" name="codeLanguage" value="python"> python
		<input type="checkbox" name="codeLanguage" value="C#"> C#
		<br><br>
		Last Name : <input type="text" name="flName"> <br /> <br /> 
		<input type="submit" value="Submit">

	</form>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>