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
//read from data
String favLang = request.getParameter("favLanguage");
//create the cookie
Cookie theCookie = new Cookie("myApp.favLanguage", favLang);
//set the life span
theCookie.setMaxAge(60*60*24*30*365);
//send the cookie to the browser
response.addCookie(theCookie);
%>

Thanks we have set your favorite language to ${param.favLanguage} <br>
<a href="cookies-homepage.jsp">Return to Homepage</a>
</body>
</html>