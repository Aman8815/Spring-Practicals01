<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login_Page</title>
</head>
<body>
	<%@ include file="Header.jsp"%>
	<sf:form method="post" modelAttribute="form">
		<table align="center">
			<h1 style="color: red;" align="center">Login_Page</h1>
			<h2 style="color: green;" align="center">${erormsg}</h2>
			<tr>
				<th>Login:</th>
				<td><sf:input path="login" placeholder="Enter the login" /></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><sf:password path="password"
						placeholder="Enter the Password" /></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" name="operation" value="signIn">
					<input type="submit" name="operation" value="signUp"></td>
			</tr>
		</table>
	</sf:form>
	<%@ include file="Footer.jsp"%>
</body>
</html>