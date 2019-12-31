<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	Welcome ${param.fName} ${param.lName} ${param.flName}
	<br> Student's country : ${param.country}
	<br> Favorite Language :
	<%
		String[] lan = request.getParameterValues("codeLanguage");

		for (String s : lan) {
			out.println("<li>" + s + "</li>");
		}
	%>

</body>
</html>