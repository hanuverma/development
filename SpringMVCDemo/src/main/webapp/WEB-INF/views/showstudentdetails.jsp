<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Reg form</title>
</head>
<body>


<form name="studentForm1">
<table>
	<tr>
		<td>Student Name: ${student.studentName}</td>
	</tr>
	
	<tr>
		<td>Course:${student.course}</td>
	</tr>
	<tr>
		<td><b>Student's Addresss</b></td>
	</tr>
	<tr>
	 <c:forEach var="listValue" items="${student.address}">
		<td>City: ${listValue.city}</td>
		<td>State: ${listValue.state}</td>
	</c:forEach>
	</tr>
</table>
</form>


</body>
</html>