<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Data Added Successfully</title>
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
	background-color: #131A22;
	padding: 15px;
}

.navbar {
	justify-content: space-between;
	padding: 0 30px;
}

.navbar-brand img {
	width: 40px;
	height: 40px;
}

.navbar-brand, .nav-link {
	color: #ffffff !important;
}

.nav-link:hover {
	color: #007bff !important;
}

/* Body Styles */
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
}

.container {
	background-color: #fff;
	padding: 30px;
	border-radius: 8px;
	box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
	text-align: center;
	max-width: 600px;
	margin-top: 50px;
}

.container h1 {
	font-size: 2rem;
	color: #28a745;
	margin-bottom: 20px;
}

.btn {
	padding: 10px 20px;
	font-size: 16px;
	background-color: #007bff;
	color: white;
	border: none;
	border-radius: 5px;
	text-decoration: none;
	cursor: pointer;
}

.btn:hover {
	background-color: #0056b3;
}

/* Footer Styles */
footer {
	background-color: #131A22;
	color: #DDDDDD;
	text-align: center;
	padding: 20px;
	position: fixed;
	width: 100%;
	bottom: 0;
}

footer div {
	margin: 5px 0;
}
</style>
</head>
<body>

	<!-- Header -->
	<header>
		<nav>
			<a class="navbar-brand" href="#"> <img
				src="https://a0.anyrgb.com/pngimg/520/242/web-shop-phone-app-online-store-e-commerce-creative-artwork-shopping-cart-creative-logo-design-creative-creative-background-cart.png"
				alt="" width="30" height="30" class="d-inline-block align-text-top">
				MobileStore
		</nav>
	</header>

	<!-- Body -->
	<div class="container">
		<h1>Data is Successfully Added!</h1>
		<p>Your data has been successfully saved. You can continue to add
			more data or return to the home page.</p>
		<a href="index.jsp" class="btn">Go to Home Page</a>
	</div>

	<!-- Footer -->
	<footer>
		<div>Designed by: Prajwal</div>
		<div>Application Name: Mobile Store Application</div>
	</footer>

</body>
</html>
