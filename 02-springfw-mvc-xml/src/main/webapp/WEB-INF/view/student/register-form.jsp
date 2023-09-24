<%@ include file="/WEB-INF/taglib/libraries.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC - Student Page</title>
<link href="${contextPath}/resources/css/style.css" rel="stylesheet">
</head>
<body>
	<h1>Spring MVC - Student Register Form</h1>

	<hr>

	<form:form action="${contextPath}/student/send-reg-req" method="post"
		modelAttribute="student">
		<table>
			<tr>
				<td><label>Id</label></td>
				<td><form:input type="text" path="id" /> <form:errors
						path="id" cssClass="text-danger"></form:errors></td>
			</tr>
			<tr>
				<td><label>Name</label></td>
				<td><form:input type="text" path="name" /> <form:errors
						path="name" cssClass="text-danger"></form:errors></td>
			</tr>
			<tr>
				<td><label>Age</label></td>
				<td><form:input type="number" min="10" max="40" path="age" />
					<form:errors path="age" cssClass="text-danger"></form:errors></td>
			</tr>
			<tr>
				<td><label>Country</label></td>
				<td><form:select path="country">
						<%-- <c:forEach var="mockCountry" items="${mockCountries}">
							<form:option value="${mockCountry}">${mockCountry}</form:option>
						</c:forEach> --%>
						<form:options items="${mockCountries}" itemValue="code"
							itemLabel="name" />
					</form:select> <form:errors path="country" cssClass="text-danger"></form:errors></td>
			</tr>

			<tr>
				<td><label>OperatingSystems</label></td>
				<td><form:checkboxes items="${mockOses}"
						path="operatingSystems" /> <form:errors path="operatingSystems"
						cssClass="text-danger"></form:errors></td>
			</tr>

			<tr>
				<td><label>Course Code</label></td>
				<td><form:input type="text" path="courseCode" /> <form:errors
						path="courseCode" cssClass="text-danger"></form:errors></td>
			</tr>

			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Send"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>