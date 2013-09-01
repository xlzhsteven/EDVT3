<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
<s:form action="createChamber">
<s:textfield name="chamber.name" label="Chamber Name"></s:textfield>
<s:textfield name="chamber.location" label="Chamber Location"></s:textfield>
<s:submit value="Submit"></s:submit>
</s:form>
</html>
</body>
</html>