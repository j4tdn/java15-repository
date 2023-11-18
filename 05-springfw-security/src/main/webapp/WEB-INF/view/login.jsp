<%@ include file="/WEB-INF/taglib/import.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Sign In Page</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" >
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet"/>
	
	<link href="${contextPath}/static/css/style.css" rel="stylesheet">
	
</head>
<body>
	<div class="container">
		<c:if test="${regSuccess != null}">
			<div class="text-center text-success">${regSuccess}</div>
		</c:if>
		
		<form:form class="form-signin border border-secondary" method="post" action="${contextPath}/login">
			<c:if test="${param.error != null}">
				<p class="center red"> Bad Credentials </p>
			</c:if>
			<c:if test="${param.logout != null}">
				<p class="text-white bg-success center"> Logout successful </p>
			</c:if>
			<h2 class="form-signin-heading center">Login Page</h2>
			<p>
				<label for="username" class="sr-only">Username</label> 
				<input type="text" id="username" name="username" class="form-control"
					placeholder="Username" required>
			</p>
			<p>
				<label for="password" class="sr-only">Password</label> <input
					type="password" id="password" name="password" class="form-control"
					placeholder="Password" required>
			</p>
			<button class="btn btn-lg btn-dark btn-block" type="submit">
				Log in
			</button>
		</form:form>
			
		<div class="center">
			<a href="${contextPath}/user/register">Have not user yet ? Register</a>
		</div>
		
		</div>
</body>
</html>