<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP file</title>
</head>
<body>
<%@ include file="file1.txt" %> 
<br/>
<jsp:include page="file2.txt"></jsp:include>
</body>
</html>