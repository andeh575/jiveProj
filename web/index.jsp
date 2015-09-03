<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<s:head/>
<title>Development Environment Entry System</title>
</head>
<body>
	<h1>Development Environment Entry System</h1>
	
	<!-- Validation is performed server-side -->
	<s:form action="submitEntry" method="POST">
		<s:select label="OS" name="os" headerKey="" headerValue="-- Please Select --" list="{'Windows','Linux','OS X', 'android','iOS','Other'}"/>
		<s:textfield label="Version" name="version"/>
		<s:textfield label="Notes" name="notes"/>
		<s:submit/>
	</s:form>
	
	<br/><br/>
	<a href="<s:url action="displayDevEnvList"/>">View Existing Development Environments</a>
	
</body>
</html>