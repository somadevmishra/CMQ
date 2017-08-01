<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.error {
	color: red;
}
</style>

<title>Login</title>
</head>
<body>
<form:form action="login" modelAttribute="loginForm" method="post">

	<table >
	<tr>
		<td>User name</td><td><form:input path="username"/> </td>
		<td><form:errors path="username" cssClass="error"/>
	</tr>
	<tr>
		<td>Password</td><td><form:password path="password"/></td>
		<td><form:errors path="password" cssClass="error"/>
	</tr>
	<tr align="center">
	<td colspan="2">
	<button type="submit" value="Login">Login </button>
	</td></tr>
	</table>
</form:form>

</body>
</html>