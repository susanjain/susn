

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name = request.getParameter("name");
String password= request.getParameter("pwd");
if(name.equals("ajay")&&password.equals("arjun"))
{
	response.sendRedirect("NewFile1.html");
}
else
{
	response.sendRedirect("NewFile.html");
}

%>
</body>
</html>