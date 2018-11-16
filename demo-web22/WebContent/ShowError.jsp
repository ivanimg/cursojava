<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true" %>
<html>
<head>
	<title>Show Error Page</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h1>Opps...</h1>
	<p>Sorry, an error occurred.</p>
	<p>Here is the exception stack trace: </p>
	<% //exception.printStackTrace(response.getWriter()); %>
	<%@ include file="footer.jsp" %>