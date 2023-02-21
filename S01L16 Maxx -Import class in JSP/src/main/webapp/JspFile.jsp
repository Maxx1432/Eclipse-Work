<%@ page import="java.util.Date,com.maxx.UserDefined" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= new Date() %>
<br/>

<%--<%@ page import="com.maxx.UserDefined" %> --%>

<% out.print(new UserDefined().demo()); %>
</body>
</html>