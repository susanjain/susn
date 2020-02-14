
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<ul> <li>Request Method:<%=request.getMethod() %></li>
<li>Request Uri:<%=request.getRequestURI() %></li>
<li>Request Protocol:<%=request.getProtocol() %></li>
<li>Server Name:<%=request.getServerName() %></li>
<li>Server Port :<%=request.getServerPort() %></li>
<li>Remote Address:<%=request.getRemoteAddr() %></li>
<%java.util.Enumeration e = request.getHeaderNames();
out.println("<H3>Following are the headers coming from the client<BR></H3>");
out.println("<table border=2 bordercolor=blue>");
out.println("<tr><th>Header Name</th><th>Header Value</th></tr>");
while(e.hasMoreElements())
{
String name=(String)e.nextElement();
String value=request.getHeader(name);
out.println("<tr><th>"+name+"</th><th>"+value+"</th></tr>");
}
%>
</ul>
</body>
</html>