<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application</title>
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

	<form action="submit" method="post">
		<div align="center">
			<h1>Adding Farmer Details</h1>
			<br>
			<br>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Enter Name</label> <input
					type="text" class="form-control" id="inputEmail4" name="farmerName">
			</div>
			<br>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Enter Contact
					Number</label> <input type="tel" class="form-control" id="inputEmail4"
					name="contactNumber">
			</div>
			<br>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Enter Address</label> <input
					type="text" class="form-control" id="inputEmail4" name="address">
			</div>
			<br>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Enter Total Area</label>
				<input type="text" class="form-control" id="inputEmail4" name="area">
			</div>
			<br>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Enter Soil Type</label>
				<input type="text" class="form-control" id="inputEmail4"
					name="soilType">
			</div>
			<br> <input class="btn btn-primary" type="submit" value="Submit"><br>
			<br>
			<br>
		</div>
	</form>

	<footer>
		<div>Designed by: Prajwal</div>
		<div>Application Name: Farmer Management</div>
	</footer>
</body>
</html>