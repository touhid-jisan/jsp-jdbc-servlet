<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Today's date is <%= new java.util.Date() %> <br>

text uppercase <%= new String("text").toUpperCase() %> <br>

boolean expression <%= 25>23 %> <br>

<%!
//method declaration
String makeLowerCase(String s) {
	return (s.toLowerCase());
}
	
%>

method declaration <%= makeLowerCase("TOUHID") %>

</body>
</html>