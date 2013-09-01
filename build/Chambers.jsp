<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>get chamber list</title>
</head>
<body>
<h1>This is the list of the chamber</h1>

<h2>All customer</h2>
<table>
<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Location</th>
</tr>
<s:iterator value="listChamber">
<tr>
<td><s:property value="id"/></td>
<td><s:property value="name"/></td>
<td><s:property value="location"/></td>
</tr>
</s:iterator>
</table>

</body>
</html>