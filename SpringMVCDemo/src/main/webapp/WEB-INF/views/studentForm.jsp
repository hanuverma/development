<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Reg form</title>
</head>
<body>


<form name="studentForm1" action="saveStudentDetails" method="post">
<table>
	<tr>
		<td>Student Name</td>
		<td><input type="text" name="studentName" /></td>
	</tr>
	
	<tr>
		<td>Course</td>
		<td><select  name="course">
			 <c:forEach var="listValue" items="${courseList}">
		        <option value="${listValue}">${listValue}</option>
		    </c:forEach>
			</select>
		</td>
	</tr>
	<tr>
		<td><b>Student's Addresss</b></td>
		<td></td>
	</tr>
	<tr>
		<td>City:</td>
		<td><input type="text" name="address.city"/></td>
		<td>State:</td>
		<td><input type="text" name="address.state"/></td>
	</tr>
	
	<tr>
		<td></td>
		<td><input type="submit" value="submit"/></td>
	</tr>
</table>
</form>

 
</body>
</html>  