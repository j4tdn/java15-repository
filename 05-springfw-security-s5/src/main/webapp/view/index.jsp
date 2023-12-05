<%@ include file="/taglib/libraries.jsp"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Security Demo - SFW 5</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<div class="container-fluid">
		<h1>Welcome to Spring S5ecurity Tutorials</h1>
		
		<hr>
		
		<h3>User: <sec:authentication property="principal.username"/></h3>
				
		<h3>Role(s): <sec:authentication property="principal.authorities"/></h3>
		
		<div>
			<sec:authorize access="hasRole('MANAGER')">
				<a href="${contextPath}/leaders">Leadership meeting</a> (Only for Manager peeps)
			</sec:authorize>
			
			<sec:authorize access="hasRole('ADMIN')">
				<a href="${contextPath}/system">IT Systems meeting</a> (Only for Admin peeps)
			</sec:authorize>
		</div>
		
		<hr>
		
		<form:form action="${contextPath}/logout" method="post">
			<input class="btn btn-success" type="submit" value="Logout">
			
			<!-- csrf -->
			<!-- The server understood the request but refuses to authorize it.  -->
			<%-- <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"> --%>
		</form:form>
		
	</div>
</body>
</html>