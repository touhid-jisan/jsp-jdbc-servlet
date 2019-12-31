<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action=todo-demo.jsp>
		Add new Item : <input type="text" name="theItem" /> <br /> <br>
		<input	type="submit" value="Submit" /><br><br><br>
	</form>

Item Entered 

<%
List<String> items = (List<String>) session.getAttribute("myToDoList");

if(items == null) {
	items = new ArrayList<String>();
	session.setAttribute("myToDoList", items);
}
String theItem = request.getParameter("theItem");
if(items!= null) {
	items.add(theItem);
}

%>

<ol>
<%
for(String s : items) {
	out.println("<li>"+ s+"</li>");
}
%>

</ol>

</body>
</html>