<%!
    private String getName()
    {
    	return "Susan Jain";
    }
    private String phone()
    {
    	return "9744408888";
    }
    private String getCity()
    {
    	return "Kochi";
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#6E6E6E">
<center>
<font size="+3" color="#F2F2F2">
Information about <%= getName() %>...<br>
Contact Number : <%= phone()%><br>
City : <%=getCity() %>
</font>
</center>
</body>
</html>