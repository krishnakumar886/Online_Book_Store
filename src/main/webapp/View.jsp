<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.*,com.onlinebookstore.BookBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String fName = (String) session.getAttribute("fname");
	ArrayList<BookBean> al = (ArrayList<BookBean>) session.getAttribute("al");
	out.println("Page of " + fName + "<br>");
	String s1 = (String) application.getAttribute("s1");
	if (s1.equals("User")) {
	%>
	<jsp:include page="link1.html" />
	<%
	} else {
	%>
	<jsp:include page="link2.html" />
	<%
	}
	%>
	<br>
	<%
	Iterator<BookBean> it = al.iterator();
	while (it.hasNext()) {
		BookBean bb = (BookBean) it.next();

		out.println(bb.getbCode() + "&nbsp&nbsp" + bb.getbName() + "&nbsp&nbsp" + bb.getbAuthor() + "&nbsp&nbsp"
		+ bb.getbPrice() + "&nbsp&nbsp" + bb.getbQty());
	}
	%>
</body>
</html>