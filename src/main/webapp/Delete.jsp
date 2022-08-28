<%@ page language="java"
contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<%
String fName = (String)session.getAttribute("fname");
out.println("Page of "+fName+"<br>");
%>
<jsp:include page="link2.html"/>
<%
out.println("<html><body text=white><center><h2>");
out.println("<br>Book Details deleted Successfully...");
out.println("<br></h2></center></body</html>");
%>
</body>
</html>