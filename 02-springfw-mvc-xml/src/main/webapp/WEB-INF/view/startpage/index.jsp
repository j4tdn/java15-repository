<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC - Start Page</title>
<link href="${contextPath}/resources/css/style.css" rel="stylesheet">
</head>
<body>
	<h1 class="page-title">Spring MVC - Start Page</h1>

	<hr>

	<h3>
		Navigate to <a href="${contextPath}/student/">student</a> page
	</h3>

	<h3>
		Navigate to <a href="${contextPath}/customer/">customer</a> page
	</h3>

	<h3>
		Navigate to <a href="${contextPath}/employee/">employee</a> page
	</h3>

</body>
</html>