<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login_Page</title>
</head>
<body>
<%-- 	<%@ include file="Header.jsp"%> --%>
	<sf:form method="post" modelAttribute="form">
		<table align="center">
			<h1 style="color: red;" align="center">Login_Page</h1>
			<h2 style="color: green;" align="center">${smsg}</h2>
			<h2 style="color: red;" align="center">${emsg}</h2>
			<tr>
				<th>Login:</th>
				<td><sf:input path="login" placeholder="Enter the login" /></td>
				<td style="color: red"><sf:errors path="login"></sf:errors></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><sf:password path="password"
						placeholder="Enter the Password" /></td>
				<td style="color: red"><sf:errors path="password"></sf:errors></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" name="operation" value="signIn">
					<input type="submit" name="operation" value="signUp"></td>
			</tr>
		</table>
	</sf:form>
<%-- 	<%@ include file="Footer.jsp"%> --%>
</body>
</html>