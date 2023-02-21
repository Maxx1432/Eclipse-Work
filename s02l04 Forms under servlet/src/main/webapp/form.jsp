<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Demo</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/Controller" method="post">
Full Name: <input type="text" name="full_name" required><br/> <%-- using required for validation --%>
Gender: <input type="radio" name="gender" value="male" checked="checked"> Male <%--required not work so using checked for validation --%> 
		<input type="radio" name="gender" value="female"> Female
		<br/>
Languages Known: <input type="checkbox" name="language" value="hindi"> Hindi
				 <input type="checkbox" name="language" value="english"> English
				 <input type="checkbox" name="language" value="other"> Other
				 <br/>
County: <select name="country">
		<option value="india"> India </option>
		<option value="russia"> Russia </option>
		<option value="us"> US </option>
		<option value="uk"> UK </option>
</select>
<br/>
<input type="submit" value="Submit">
</form>
</body>
</html>