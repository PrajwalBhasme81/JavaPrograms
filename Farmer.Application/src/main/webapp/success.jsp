<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
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

form{
padding: 200px;
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
		<div class="container-fluid" style="background-color: #0F1111;">
			<a class="navbar-brand" href="#"> <img
				src="https://p1.hiclipart.com/preview/321/69/300/farmer-cartoon-agriculture-agribusiness-logo-tractor-agritech-crop-yellow-png-clipart.jpg"
				alt="" width="30" height="24" class="d-inline-block align-text-top">
				<b>FARMER</b>
			</a> <input type="button" value="Home" class="btn btn-outline-primary">
			<a href="view.jsp"><input type="button" value="View"
				class="btn btn-outline-primary"></a>
		</div>
	</header>
<form action="">
	<h1 style="align-items: center;">Data is Saved Successfully</h1>
	<p>${res}</p>
	</form>

	<footer>
		<div>Designed by: Prajwal</div>
		<div>Application Name: Farmer Management</div>
	</footer>
</body>
</html>