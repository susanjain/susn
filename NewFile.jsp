<%@ page language="java" contentType="text/html; charse0t=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*;"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
Map map=new HashMap();
map.put("name","Tim");
map.put("address","200,Saint Thomas Loop");
map.put("state","Virginia,USA");
request.setAttribute("useMap",map);
%>
<body>
<center>
<table>
<tr>
<td><b>The first element in Map is:</td></b>
<td><b>${useMap["name"]}</tr></td></b><br>
<tr><td><b>The second element in Map is:</td></b>
<td><b>${useMap["address"] }</tr></td></b><br>
<tr><td><b>The third element in Map is:</td></b>
<td><b>${useMap["state"] }</tr></td></b><br>
</table>
</center>
</body>
</html>