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
	<h1>Spring MVC - Student Register Feedback</h1>
	
	<hr>
	
	<h3>Data --> ${fbMessage}</h3>
	
</body>
</html>