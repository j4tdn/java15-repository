<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC - Student Page</title>
</head>
<body>
	<h1>Spring MVC - Student Register Form</h1>
	
	<hr>
	
	<form action="${contextPath}/student/send-reg-req" method="post">
		<table>
			<tr>
				<td><label>Id</label></td>
				<td><input type="text" name="student-id"></td>
			</tr>
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" name="student-name"></td>
			</tr>
			<tr>
				<td><label>Age</label></td>
				<td><input type="number" min="15" max="40" name="student-age"></td>
			</tr>
			
			<tr>
				<td><input type="reset" value="Reset" ></td>
				<td><input type="submit" value="Send"></td>
			</tr>
		</table>
	</form>
	
</body>
</html>