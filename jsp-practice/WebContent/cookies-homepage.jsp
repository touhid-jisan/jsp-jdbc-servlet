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
String favLang = "JAva";

Cookie[] theCookies = request.getCookies();

if(theCookies != null) {
	for(Cookie tempCookie: theCookies) {
		if("myApp.favLanguage".equals(tempCookie.getName())) {
			favLang = tempCookie.getValue();
			break;
		}
	}
}
%>
fav language cookie changed to : <%= favLang %> <br>

<a href="cookies-personalize-form.html" >Personalize this page</a>

</body>
</html>