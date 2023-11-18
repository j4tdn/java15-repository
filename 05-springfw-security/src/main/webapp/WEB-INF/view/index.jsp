<%@ include file="/WEB-INF/taglib/import.jsp" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home - Security Page</title>
	
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" >
	
	
</head>
<body>

	<div class="container-fluid">
		<div>
			<h1>Welcome to Spring Security Tutorials</h1>
			
			<hr>
				
				<h3>User: <sec:authentication property="principal.username"/></h3>
				
				<h3>Role(s): <sec:authentication property="principal.authorities"/></h3>
				
				<h3>Full name: ${user.firstName} &nbsp; ${user.lastName}</h3>
				
				<div>
					<sec:authorize access="hasRole('MANAGER')">
						<a href="${contextPath}/leaders">Leadership meeting</a> (Only for Manager peeps)
					</sec:authorize>
					
					<sec:authorize access="hasRole('ADMIN')">
						<a href="${contextPath}/system">IT Systems meeting</a> (Only for Admin peeps)
					</sec:authorize>
				</div>
				
			<hr>

			<form action="${contextPath}/logout" method="post">
				<input class="btn btn-success" type="submit" value="Logout">
				
				<!-- csrf -->
				<!-- The server understood the request but refuses to authorize it.  -->
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
			</form>
		</div>
	</div>
	
	
</body>
</html>