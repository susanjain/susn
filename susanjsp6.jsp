
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>setProperty/getProperty Demo</title>
</head>
<body>
<%--Find and instantiate the bean, myBean--%>
<jsp:useBean id="myBean" class="myBean.LocaleBean"/>
<%--specify an initial cost value--%>
<jsp:setProperty name="myBean" property="cost" value="10.00"/>
<table width="100%" border="2" cellpadding="2" style="text-align:center">
<tr style="background:cyan">
<td>Cost</body>td>
<td>+20% markup</td>
<td>Subtotal</td>
<td>+12.5% VAT</td>
<td>Total</td>
</tr>
<tr style="background:yellow">
<td><jsp:getProperty name="myBean" property="costPrice"/></td>
<td><jsp:getProperty name="myBean" property="markup"/></td>
<td><jsp:getProperty name="myBean" property="subtotal"/></td>
<td><jsp:getProperty name="myBean" property="vat"/></td>
<td><jsp:getProperty name="myBean" property="total"/></td>
</tr>
</table>
</body>
</html>