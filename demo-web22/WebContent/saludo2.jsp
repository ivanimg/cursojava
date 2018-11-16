<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Hola <%= session.getAttribute("usuario") %></p>
	<p>Tu idioma es el <%= session.getAttribute("idioma") %></p>
	</br>
</body>
</html>