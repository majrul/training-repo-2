<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String agent = request.getHeader("user-agent");
%>
<h1>You are currently using :: <%= agent %></h1>
<h2><%= LocalTime.now() %></h2>
<%
	//response.setHeader("refresh", "1");
	//response.setHeader("refresh", "5;url=https://www.google.com");
	
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
	response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
	response.setDateHeader("Expires", 0); // Proxies.
%>
</body>
</html>