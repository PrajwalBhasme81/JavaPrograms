<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Mobile Data</title>
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
/* Header Styles */
header {
	padding: 15px;
	background-color: #131A22;
}
/* Body Styles */




h1 {
	text-align: center;
	color: green;
}







/* Footer Styles */
footer {
	background-color: #131A22;
	text-align: center;
	padding: 10px;
	color: #DDDDDD;
}

/* Button Styles in Header */
.nav-button {
	padding: 10px 20px;
	font-size: 16px;
	background-color: #007bff;
	color: white;
	border: none;
	border-radius: 5px;
	text-decoration: none;
}

.nav-button:hover {
	background-color: #0056b3;
	color: white;
}
</style>
</head>
<body>

	<!-- Header Section -->
	<header>
		<nav>
			<a class="navbar-brand" href="#"> <img
				src="https://a0.anyrgb.com/pngimg/520/242/web-shop-phone-app-online-store-e-commerce-creative-artwork-shopping-cart-creative-logo-design-creative-creative-background-cart.png"
				alt="" width="30" height="30" class="d-inline-block align-text-top">
				MobileStore
			</a> <a href="index.jsp" class="nav-button">Home</a>
		</nav>
	</header>

	<!-- Body Section -->
	<div class="main-content">
		<form action="submit" method="post">
			<h1>MOBILE DETAILS</h1>

			<label for="brand">Mobile Brand</label> 
			<input type="text" id="brand" name="brand" placeholder="Enter Mobile Brand" required> 
			<label for="ram">RAM Size (GB)</label> 
			<input type="number" id="ram" name="ram" placeholder="Enter RAM Size (GB)" required> 
			<label for="storage">Mobile Storage (GB)</label> 
			<input type="number" id="storage" name="storage" placeholder="Enter Mobile Storage (GB)" required> 
			<label for="warrenty">Mobile Warranty (in years)</label> 
			<input type="number" id="warrenty" name="warrenty" placeholder="Enter Mobile Warranty (in years)" required step="1">
			<label for="price">Mobile Price</label> <input type="number" id="price" name="price" placeholder="Enter Mobile Price" required>

			<input type="submit" value="Submit">
			<input type="reset" value="Reset">
			
		</form>
	</div>

	<!-- Footer Section -->
	<footer>
		<div>Designed by: Prajwal</div>
		<div>Application Name: Mobile Store Application</div>
	</footer>

</body>
</html>
