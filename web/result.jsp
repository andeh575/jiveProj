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
	<s:a href="index.jsp">Back to Entry</s:a><br/>
	<s:action name="displayDevEnvList"/>
	<display:table id="devEnvTable" name="devEnvironments" pagesize="10" cellpadding="5px;" cellspacing="5px;" requestURI="" sort="list">
		<display:column property="os" title="OS" sortable="true"/>
		<display:column property="version" title="Version" sortable="true"/>
		<display:column property="notes" title="Notes"/>
	</display:table>

</body>
</html>