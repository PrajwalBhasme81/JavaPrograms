<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</head>
<style>
header{
background-color: gray;
padding: 6px;
}

form{
justify-content: center;
align-items: center;
}

.main-content{

justify-content: center;
align-content: center;
align-items: center;
}


footer{
background-color: black;
color: white;
text-align: center;
padding: 13px;
}
</style>
<body>
	<header>
		<nav class="navbar">
			<div class="container-fluid">
				 <img src="/docs/5.0/assets/brand/bootstrap-logo.svg" alt="" width="30"
					height="24" class="d-inline-block align-text-top">
					<div id="navName"><h5>MobileStore</h5></div>
				<a href="index.jsp"><input type="button" value="Home"></a>
			</div>
		</nav>
	</header>
	
	<div class="main-content">
		<form action="submit" method="post">
			<h1>MOBILE DETAILS</h1>

			<label for="brand">Mobile Brand</label> <br>
			<input type="text" id="brand" name="brand" placeholder="Enter Mobile Brand" required> <br><br>
			<label for="ram">RAM Size (GB)</label> <br>
			<input type="number" id="ram" name="ram" placeholder="Enter RAM Size (GB)" required> <br><br>
			<label for="storage">Mobile Storage (GB)</label> <br>
			<input type="number" id="storage" name="storage" placeholder="Enter Mobile Storage (GB)" required> <br><br>
			<label for="warrenty">Mobile Warranty (in years)</label> <br>
			<input type="number" id="warrenty" name="warrenty" placeholder="Enter Mobile Warranty (in years)" required step="1"><br><br>
			<label for="price">Mobile Price</label> <br>
			<input type="number" id="price" name="price" placeholder="Enter Mobile Price" required><br><br>

			<input type="submit" value="Submit">
			<input type="reset" value="Reset">
			
		</form>
	</div>
	
	


	<footer>
		<div>Designed by: Prajwal</div>
		<div>Application Name: Mobile Store Application</div>
	</footer>

</body>
</html>