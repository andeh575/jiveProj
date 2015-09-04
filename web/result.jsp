<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link href="${pageContext.request.contextPath}/css/table.css" rel="stylesheet" type="text/css"/>
		<title>Development Environment Entry System</title>
	</head>
	<body>
		<s:a href="entry.jsp">Back to Entry</s:a><br/><br/>
		
		<!-- Generates and displays a table using displaytag library -->
		<s:action name="displayDevEnvList"/>
		<display:table id="devEnvTable" name="devEnvironments" pagesize="10" cellpadding="5px;" cellspacing="5px;" requestURI="" sort="list"
						defaultsort="1" defaultorder="descending">
			<display:column property="os" title="OS" sortable="true" style="text-align:left"/>
			<display:column property="version" title="Version" sortable="true" style="text-align:left"/>
			<display:column property="notes" title="Notes" style="text-align:left"/>
		</display:table>
		
	</body>
</html>