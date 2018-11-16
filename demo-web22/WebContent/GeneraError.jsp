<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="ShowError.jsp" %>
<html>
<head>
<title>Error Handling </title>
</head>
<body>
	<%
		int x = 1;
		if (x == 1) {
			throw new RuntimeException("Error intencionado!!!");
		}
	%>
</body> </html>