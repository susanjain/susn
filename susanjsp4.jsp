
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h1>Including the error page</h1>
</head>
<body>
<%!int a=10,b=0; %>
<%int c=a/b; %>
<%=c %>
<%@page errorPage="susanjsp5.jsp" %>
</body>
</html>
