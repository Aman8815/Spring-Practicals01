
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
<title>Insert title here</title>
</head>
<body>
<%-- 	<%@ include file="Header.jsp"%> --%>
	<div align="center">
		<sf:form method="post" modelAttribute="form">
			<h2>User List</h2>
			<h2 style="color: red">${emsg}</h2>
			<h2 style="color: green">${smsg}</h2>
			<sf:hidden path="pageNo" />
			<table>
				<tr>
					<th>FirstName:</th>
					<td><sf:input path="firstName" />&nbsp; &nbsp;</td>
					<th>Login:</th>
					<td><sf:input path="Login" />&nbsp; &nbsp;</td>
					<td><input type="submit" name="operation" value="search">
					</td>

				</tr>

			</table>
			<table style="width: 100%" border="1">
				<tr style="background-color: red">
					<th>Select</th>
					<th>ID</th>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Login</th>
					<th>Password</th>
					<th>Edit</th>
				</tr>
				<c:forEach items="${list}" var="user" varStatus="i">
					<c:set var="start" value="${(form.pageNo - 1) * 5}" />
					<tr align="center" style="background-image: none;">
						<td><sf:checkbox path="ids" value="${user.id}" /></td>
						<td><c:out value="${start+i.index+1}"></c:out></td>
						<td><c:out value="${user.firstName }"></c:out></td>
						<td><c:out value="${user.lastName }"></c:out></td>
						<td><c:out value="${user.login }"></c:out></td>
						<td><c:out value="${user.password }"></c:out></td>
						<td align="center"><a
							href="<c:url value="/ctl/AddUserCtl?id=${user.id}" />">Edit</a></td>
					</tr>
				</c:forEach>
			</table>
			<br>
			<table style="width: 100%">
				<tr>
					<td style="width: 30%"><input type="submit" name="operation"
						value="previous" ${form.pageNo == 1 ? 'disabled="disabled"' : ''} /></td>
					<td align="center"><input type="submit" name="operation"
						value="delete"></td>
					<td style="text-align: right;"><input type="submit"
						name="operation" value="next"
						${list.size() < 5 ? 'disabled="disabled"' : ''}></td>
				</tr>
			</table>
		</sf:form>
<%-- 		<%@ include file="Footer.jsp"%> --%>
	</div>
</body>
</html>
