<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set Property</title>
</head>
<body>
<jsp:useBean id="user" class="com.maxx.User" scope="session"></jsp:useBean>
<jsp:setProperty property="firstName" name="user" value="Mahendra"/>
<jsp:setProperty property="lastName" name="user" value="Chawla"/>
Values have been set.
</body>
</html>