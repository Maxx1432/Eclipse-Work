<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="<%= request.getContextPath()%>/SiteController" method="post">
Username: <input type="text" name="username" required="required"><br/>
Password: <input type="password" name="password" required="required "><br/>
<input type="hidden" name="action" value="loginSubmit">
<input type="submit" value="submit">
</form>
</body>
</html>