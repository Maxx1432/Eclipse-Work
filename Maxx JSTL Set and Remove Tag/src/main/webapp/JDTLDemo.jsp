<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Tags</title>
</head>
<body>
<c:set var="name" value="Maxx"></c:set>
<c:out value="${name}"></c:out>
${name}
<c:remove var="name"/>
${name}
</body>
</html>