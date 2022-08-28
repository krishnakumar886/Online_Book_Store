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
	String s1 = (String) application.getAttribute("s1");
	if (s1.equals("User")) {
	%>
	<jsp:forward page="UserLogin.html" />
	<%
	} else {
	%>
	<jsp:forward page="AdminLogin.html" />
	<%
	}
	%>
</body>
</html>