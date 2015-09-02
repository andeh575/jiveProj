<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Development Environment Entry System</title>
</head>
<body>
	<s:property value="status"/> <br/>
	OS: <s:property value="os"/><br/>
	Version: <s:property value="version"/><br/>
	Notes: <s:property value="notes"/><br/>
</body>
</html>