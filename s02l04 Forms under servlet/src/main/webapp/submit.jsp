<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit</title>
</head>
<body>
Name: <%= request.getParameter("full_name") %> <br/>
Gender <%= request.getParameter("gender") %> <br/>
Language <%
String [] countries = request.getParameterValues("language");
if(countries!=null)
{
	for(String temp : countries)
	{
		out.print(temp.toUpperCase());
		out.print("<br/>");
	}
}
else
{
	out.print("No language Selected");	
}
 

%>
Country: <%= request.getParameter("country") %> <br/>
</body>
</html>