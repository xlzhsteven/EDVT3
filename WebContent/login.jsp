<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
	<s:form action="loginAction">
		<s:textfield name="user.userName" label="User Name"></s:textfield>
		<s:password name="user.password" label="Password"></s:password>
		<s:submit value="Submit"></s:submit>
	</s:form>
</body>
</html>