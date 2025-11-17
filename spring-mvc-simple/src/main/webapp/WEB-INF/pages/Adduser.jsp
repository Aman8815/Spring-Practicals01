
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
<title>User</title>
</head>
<body>
<%-- 	<%@ include file="Header.jsp"%> --%>
	<sf:form method="post" modelAttribute="form">
		<div align="center">
			<c:if test="${form.id>0}">
				<h1 style="color: navy">Update User</h1>
			</c:if>
			<c:if test="${form.id==0}">
				<h1 style="color: navy">Add User</h1>
			</c:if>
			<h2 style="color: green">${smsg}</h2>
			<h2 style="color: red">${emsg}</h2>
			<table>
				<tr>
					<th align="left">First Name :</th>
					<td><sf:input path="firstName" placeholder ="Enter the firstName"/></td>
					<td style="color: red"><sf:errors path="FirstName"></sf:errors></td>
				</tr>
				<tr>
					<th align="left">Last Name :</th>
					<td><sf:input path="lastName" placeholder ="Enter the lastName"/></td>
					<td style="color: red"><sf:errors path = "lastName"></sf:errors></td>
				</tr>
				<tr>
					<th align="left">Login ID :</th>
					<td><sf:input path="login" placeholder ="Enter the login" readonly="false"/></td>
					<td style="color: red"><sf:errors path = "Login"></sf:errors></td>
				</tr>
				<tr>
					<th align="left">Password :</th>
					<td><sf:input path="password"  placeholder ="Enter the password"/></td>
					<td style="color: red"><sf:errors path = "password"></sf:errors></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" name="operation" value=${form.id >0 ? 'Update' : 'Save'} ></td>
				</tr>
			</table>
		</div>
	</sf:form>
<%-- 	<%@ include file="Footer.jsp"%> --%>
</body>
</html>
