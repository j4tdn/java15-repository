<%@ include file="/WEB-INF/taglib/import.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Access Denied Page</title>
	
	<link href="${contextPath}/static/css/style.css" rel="stylesheet">
	
</head>
<body>
	<h3> Access denied - You have not authorized to access this resource </h3>
	
	<h3>Redirect to your home page after <span id="runner" class="red">10</span> seconds</h3>
	
	<hr>
	
	<p>
		<a href="${contextPath}/">Back to Home Page</a>
	</p>
	
	<script>
		let counter = 10;
		let interval = setInterval(() => {
			counter--;
			document.querySelector("#runner").textContent = counter;
			if (counter === 0) {
				window.location.href = "${contextPath}/";
				clearInterval(interval);	
			}
		}, 1000);
	</script>
</body>
</html>