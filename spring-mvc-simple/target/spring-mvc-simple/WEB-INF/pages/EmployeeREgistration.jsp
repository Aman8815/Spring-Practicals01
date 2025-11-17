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
<title>Employee Registration</title>
</head>
<body>
  <sf:form modelAttribute="form" method="post">
  <div align="center">
   <h1 style="color: navy">Employee Registration Form</h1>
   <h2 style="color: green" >${smsg}</h2>
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
       <th align="left">Address :</th>
      <td><sf:input path="address" placeholder="Enter the address"/></td>
      </tr>
          <th align="left">Salary :</th>
      <td><sf:input path="salary" placeholder="Enter the salary"/></td>
      </tr>
      <tr>
					<th></th>
					<td style="text-decoration: underline;"><input type="submit" name="operation" value="signUp">&nbsp;&nbsp;<a href="Userlogin">signIn</a></td>
					
				</tr>
    </table>
  </div>
  </sf:form>
</body>
</html>