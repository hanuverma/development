<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form name="empReg" action="createEmp" method="post">
<table>
	<tr>
		<td>Username:</td>
		<td><input type="text" name="userName"  id="userName"/></td>
	</tr>
	
	<tr>
		<td>Password:</td>
		<td><input type="password" name="password" id="password"/></td>
	</tr>
	
	<tr>
		<td></td>
		<td><a href="forgetpassword">Forget Password</a></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="submit" name="submit"/></td>
	</tr>
	
</table>
</form>


</body>
</html>