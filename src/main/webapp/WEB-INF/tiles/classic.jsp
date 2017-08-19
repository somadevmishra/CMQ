<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<!-- Load jQuery from Google's CDN -->
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>

<!-- Source our javascript file with the jQUERY code -->
<script src="<c:url value="/resources/js/sidemenu.js"/>"></script>

<link href="<c:url value="/resources/css/sidemenu.css" />" rel="stylesheet">

<title><tiles:getAsString name="title" /></title>
</head>
<body>
	<table>
		<tr>
			<td colspan="2"><tiles:insertAttribute name="header" /></td>
		</tr>
		<tr>
			<td><tiles:insertAttribute name="menu" /></td>
			<td><tiles:insertAttribute name="body" /></td>
		</tr>
		<tr>
			<td colspan="2"><tiles:insertAttribute name="footer" /></td>
		</tr>
	</table>
</body>
</html>