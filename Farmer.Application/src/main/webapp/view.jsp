<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<style>
header {
	padding: 10px;
	background-color: #0F1111;
}

form {
	padding: 180px;
	color: white;
	background-image:
		url("https://static.vecteezy.com/system/resources/previews/008/908/668/non_2x/indian-farmer-working-in-village-agriculture-vector.jpg");
}

footer {
	background-color: #131A22;
	text-align: center;
	justify-content: center;
	padding: 10px;
	color: #DDDDDD;
}
</style>
<body>
	<header>
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://p1.hiclipart.com/preview/321/69/300/farmer-cartoon-agriculture-agribusiness-logo-tractor-agritech-crop-yellow-png-clipart.jpg"
				alt="" width="30" height="24" class="d-inline-block align-text-top">
				<b>FARMER</b>
			</a> <a href="index.jsp"><input type="button" value="Home"
				class="btn btn-outline-primary"></a>
		</div>
	</header>


	<form action="view" method="get" align="center">
		<br> <input class="btn btn-light" type="submit" value="View">

		<table align="center">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Contact</th>
					<th>Address</th>
					<th>Total Area</th>
					<th>Soil Type</th>
					<th>Action</th>
				</tr>

			</thead>
			<tbody>
				<c:forEach var="dto" items="${listOfValue}">
					<tr>
						<td>${dto.id}</td>
						<td>${dto.name}</td>
						<td>${dto.contactNumber}</td>
						<td>${dto.address}</td>
						<td>${dto.area}</td>
						<td>${dto.soilType}</td>
						<td> 
						<a href="update?id=${dto.id}"><input type="button" class="btn btn-primary" value="Update"></a>
						<a href="delete?id=${dto.id}"><input type="button" class="btn btn-danger" value="Delete"></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>

	<footer>
		<div>Designed by: Prajwal</div>
		<div>Application Name: Farmer Management</div>
	</footer>
</body>
</html>