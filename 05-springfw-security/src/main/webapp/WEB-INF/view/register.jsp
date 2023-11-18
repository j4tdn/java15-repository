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
		<c:if test="${existedUser != null}">
			<div class="text-center text-danger">${existedUser}</div>
		</c:if>
		
		<c:if test="${systemError != null}">
			<div class="text-center text-danger">${systemError}</div>
		</c:if>
	
		<form:form modelAttribute="user" class="form-signin border border-secondary" method="post" 
			action="${contextPath}/user/register">
			
			<h2 class="form-signin-heading center">Register Page</h2>
			<div>
				<label for="username" class="sr-only">Username</label> 
				<form:input id="username" path="username" class="form-control" placeholder="Username" />
			</div>
			<div>
				<label for="password" class="sr-only">Password</label>
				<form:input id="password" path="password" class="form-control" placeholder="Password" type="password" />
			</div>
			<div>
				<label for="firstName" class="sr-only">First Name</label> 
				<form:input id="firstName" path="firstName" class="form-control" placeholder="First Name" />
			</div>
			<div>
				<label for="lastName" class="sr-only">Last Name</label> 
				<form:input id="lastName" path="lastName" class="form-control" placeholder="Last Name" />
			</div>
			<div>
				<label for="email" class="sr-only">Email</label> 
				<form:input id="email" path="email" 
					class="form-control" placeholder="Email" />
			</div>
			<button class="btn btn-lg btn-success btn-block" type="submit">
				Register
			</button>
		</form:form>
			
		<div class="center">
			<a href="${contextPath}/login">Already have account ? Login</a>
		</div>
		
		</div>
</body>
</html>