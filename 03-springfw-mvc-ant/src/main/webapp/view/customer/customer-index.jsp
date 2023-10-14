<%@ include file="/taglib/libraries.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Customer Management Application</title>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
	rel="stylesheet">

</head>
<body>
	<header>
		<nav class="navbar navbar-light bg-light navbar-expand-lg">
			<div class="container-fluid">
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerId" aria-controls="#navbarTogglerId" aria-expanded="false" aria-label="Toggle navigation">
			      <span class="navbar-toggler-icon"></span>
			    </button>
				<a class="navbar-brand"  href="${contextPath}/">
					<svg xmlns="http://www.w3.org/2000/svg" width="42" height="32" fill="currentColor" class="bi bi-person-badge" viewBox="0 0 16 16">
					  <path d="M6.5 2a.5.5 0 0 0 0 1h3a.5.5 0 0 0 0-1h-3zM11 8a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
					  <path d="M4.5 0A2.5 2.5 0 0 0 2 2.5V14a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V2.5A2.5 2.5 0 0 0 11.5 0h-7zM3 2.5A1.5 1.5 0 0 1 4.5 1h7A1.5 1.5 0 0 1 13 2.5v10.795a4.2 4.2 0 0 0-.776-.492C11.392 12.387 10.063 12 8 12s-3.392.387-4.224.803a4.2 4.2 0 0 0-.776.492V2.5z"/>
					</svg>	
				</a>
				<div class="collapse navbar-collapse" id="#navbarTogglerId">

					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item">
							<a class="nav-link nav-customer" class="customer-page" aria-current="page" href="${contextPath}/customer">Customer</a>
						</li>
						<li class="nav-item">
							<a class="nav-link nav-stuff" href="${contextPath}/stuff">Stuff</a>
						</li>
						<li class="nav-item">
							<a class="nav-link nav-admin" href="${contextPath}/admin" tabindex="-1" aria-disabled="true">Admin</a>
						</li>
					</ul>

					<form:form action="${contextPath}/customer/search" method="GET" class="d-flex">
						<input name="text" class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-success" type="submit">Search</button>
					</form:form>
				</div>
			</div>
		</nav>
	</header>


	<main class="container-fluid">
		<a href="${contextPath}/customer/add"
			class="btn btn-primary btn-sm mt-3 mb-3"> <i
			class="far fa-address-book"></i> Add Customer
		</a>
		
		<table class="table table-bordered table-striped">
			<thead class="table-dark">
				<tr>
					<th class="text-white">#</th>
					<th>
						<a href="${contextPath}/customer/page/${currentPage}?sort-field=first-name&sort-dir=${currentSortField == 'first-name' ? reversedOrder : 'asc'}" class="text-white">First Name</a>
						<c:if test="${currentSortField == 'first-name'}">
							<span class="${currentSortDir == 'asc' ? 'fas fa-sort-up' : 'fas fa-sort-down'}"></span>
						</c:if>
					</th>
					<th>
						<a href="${contextPath}/customer/page/${currentPage}?sort-field=last-name&sort-dir=${currentSortField == 'last-name' ? reversedOrder : 'asc'}" class="text-white">Last Name</a>
						<c:if test="${currentSortField == 'last-name'}">
							<span class="${currentSortDir == 'asc' ? 'fas fa-sort-up' : 'fas fa-sort-down'}"></span>
						</c:if>
					</th>
					<th>
						<a href="${contextPath}/customer/page/${currentPage}?sort-field=email&sort-dir=${currentSortField == 'email' ? reversedOrder : 'asc'}" class="text-white">Email</a>
						<c:if test="${currentSortField == 'email'}">
							<span class="${currentSortDir == 'asc' ? 'fas fa-sort-up' : 'fas fa-sort-down'}"></span>
						</c:if>
					</th>
					<th class="text-white">Action</th>
				</tr>
			</thead>

			<tbody>	
					<c:forEach var="customer" items="${customers}" varStatus="loop"> 
					<!-- loop.count start from 1  -->
					<tr>
						<c:set var="startedRowIndex" value="${(currentPage-1)*pageSize}"></c:set>
						<td>${startedRowIndex + loop.count}</td>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.email}</td>
						<td>
							<a href="${contextPath}/customer/update?id=${customer.id}" class="btn btn-info btn-sm">Update</a> 
							<!-- 
								TODO: Enhance 
								1. Using js function to call onclick
								2. Using bootstrap popup for better UI
								3. Using REST to skip reload page
							-->
							<a onclick="if(!confirm('Are you sure to delete customer ${customer.id} ?')) return false;" href="${contextPath}/customer/delete?id=${customer.id}" class="btn btn-danger btn-sm">Delete</a>
						</td>
					</tr>
					</c:forEach>
					
			</tbody>
		</table>
		
		<!-- bootstrap d-none or disabled  -->
		<c:set var="currentSort" value="sort-field=${currentSortField}&sort-dir=${currentSortDir}"></c:set>
		<nav class="float-end">
			<ul class="pagination">
				<li class="page-item ${currentPage <= 1 ? 'd-none' : ''}">
					<a href="${contextPath}/customer/page/${currentPage-1}?${currentSort}" aria-label="Previous" class="page-link">
						<span aria-hidden="true">&laquo;</span>
					</a>
				</li>
				<c:forEach var="pageIndex" begin="1" end="${totalPages}">
				<c:set var="pageActiveStyle" value="${pageIndex == currentPage ? 'bg-warning' : '' }"></c:set>
			    <li class="page-item">
			    	<a class="page-link ${pageActiveStyle}" href="${contextPath}/customer/page/${pageIndex}?${currentSort}">${pageIndex}</a>
			    </li>
			    </c:forEach>
			    <li class="page-item ${currentPage == totalPages ? 'd-none' : ''}">
			    	<a href="${contextPath}/customer/page/${currentPage+1}?${currentSort}" aria-label="Next" class="page-link"> 
						<span aria-hidden="true">&raquo;</span>
					</a>
			    </li>
			</ul>
		</nav>
	</main>

	<footer class="bg-light fixed-bottom py-3 text-center">
		<div class="container-fluid">
			<span class="text-muted">CMA made with JAVA11  &#129392;  25.06.2022</span>
		</div>
	</footer>
	
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
	<script src="${contextPath}/resources/js/script.js"></script>
</body>
</html>