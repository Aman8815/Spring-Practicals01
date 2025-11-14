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
<title>User_Registration form</title>
</head>
<body >
<%@ include file="Header.jsp" %>
  <sf:form modelAttribute="form" method="post">
  <div align="center">
   <h1 style="color: navy">User Registration Form</h1>
   <h2 style="color: green" >${smsg}</h2>
   <h2 style="color: red">${emsg}</h2>
    <table>
      <tr>
       <th align="left">firstName :</th>
       <td><sf:input path="firstName" placeholder="Enter the FirstName"/></td>
      </tr>
      <tr>
      <th align="left">lastName :</th>
      <td><sf:input path="lastName" placeholder="Enter the LastName"/></td>
      </tr>
       <th align="left">login :</th>
      <td><sf:input path="login" placeholder="Enter the login"/></td>
      </tr>
       <th align="left">password :</th>
      <td><sf:password path="password" placeholder="Enter the password"/></td>
      </tr>
      <tr>
					<th></th>
					<td style="text-decoration: underline;"><input type="submit" name="operation" value="signUp">&nbsp;&nbsp;
					<input type="reset" name="operration" vlaue="singhIn">
					
				</tr>
    </table>
    <%@include file="Footer.jsp" %>
  </div>
  </sf:form>
</body>
</html>