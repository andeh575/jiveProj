<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
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
	
	<display:table id="devEnvTable" name="devEnvironments" pagesize="5" cellpadding="5px;" cellspacing="5px;" requestURI="">
		<display:column property="os" title="OS"/>
		<display:column property="version" title="Version"/>
		<display:column property="notes" title="Notes"/>
	</display:table>
	
</body>
</html>