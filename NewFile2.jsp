<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="name" value="Love Java Very Much"/>
<c:out value="Given String is:${name}"/>
<form method="POST">
<table>
<tr>
<td>Enter String</td>
<td><input type="text" name="searchString"></td>
</tr>
<tr>
<td></td>
<td><input type="radio" name="case1" value="y">MatchCase
<input type="radio" name="case1" value="n">IgnoreCase
</td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Search"></td>
</tr>
</table>
</form>
<c:if test="${pageContext.request.method=='POST'}">
<c:set var="searchString" value="${param.searchString}"/>
<c:if test="${param.case1=='y'}">
<c:choose>
<c:when test="${fn:contains(name,searchString)==true}">
<font size="5" color="green">String Found</font>
</c:when>
<c:otherwise>
<font size="5" color="red">String Not Found</font>
</c:otherwise>
</c:choose>
</c:if>

<c:if test="${param.case1=='n'}">
<c:choose>
<c:when test="${fn:containsIgnoreCase(name,searchString)==true}">
<font size="5" color="green">String Found</font>
</c:when>
<c:otherwise>
<font size="5" color="red">String Not Found</font>
</c:otherwise>
</c:choose>
</c:if>
</c:if>
</body>
</html>