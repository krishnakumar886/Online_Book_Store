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
	String fName = (String) session.getAttribute("fname");
	out.println("<html><body text=white>");
	out.println("Welcome Admin " + fName + "<br>");
	out.println("<br></body</html>");
	%>
	<jsp:include page="link2.html" />
</body>
</html>