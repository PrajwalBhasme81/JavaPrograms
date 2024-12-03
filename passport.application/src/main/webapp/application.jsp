<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<style>
header{
padding: 10px;
background-color: #0F1111;
}

form{
background-color: pink;
}

footer{
	background-color:#131A22;
	text-align: center;
	justify-content: center;
	padding: 10px;
	color: #DDDDDD;
}
</style>
<body>
<header>
  		<div class="container-fluid">
    	<a class="navbar-brand" href="#">
      	<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBmuUKtVoS3ilF-Rk5pERyCaI-emsPiUM1tA&s" alt="" width="30" height="24" class="d-inline-block align-text-top">
      	<b>PASSPORT</b>
   		</a>
    	<a href="index.jsp"><input type="button" value="Home" style="background-color: aqua;"></a>
    	
 		</div>
</header>		
	
	<form action="submit">
	<div align="center">
	<h1>Application Form</h1><br><br>
	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Enter your Name</label>
    <input type="text" class="form-control" id="inputEmail4" name = "userName">
  	</div><br>
  	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Enter your Email</label>
    <input type="email" class="form-control" id="inputEmail4" name = "email">
  	</div><br>
	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Enter your Father Name</label>
    <input type="text" class="form-control" id="inputEmail4" name = "fatherName">
  	</div><br>
	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Enter your Aadhar Number</label>
    <input type="number" class="form-control" id="inputEmail4" name = "aadharNumber">
  	</div><br>
	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Enter your Pancard Number</label>
    <input type="text" class="form-control" id="inputEmail4" name = "panNumber">
  	</div><br>
	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Enter your VoterId Number</label>
    <input type="text" class="form-control" id="inputEmail4" name = "voterNumber">
  	</div><br>
	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Enter your Contact Number</label>
    <input type="tel" class="form-control" id="inputEmail4" name = "contactNumber">
  	</div><br>
	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Enter your Place</label>
    <input type="text" class="form-control" id="inputEmail4" name = "place">
  	</div><br>
	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Enter your District</label>
    <input type="text" class="form-control" id="inputEmail4" name = "district">
  	</div><br>
	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Enter your State</label>
    <input type="text" class="form-control" id="inputEmail4" name = "state">
  	</div><br>
	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Enter your PinCode</label>
    <input type="number" class="form-control" id="inputEmail4" name = "pincode">
  	</div><br>
	
	<input type="submit" value="SUBMIT" style="background-color: aqua;"><br><br><br>
	</div>
	</form>
	
<footer>
    <div>Designed by: Prajwal</div>
    <div>Application Name: Passport Booking</div>
</footer>
	
</body>
</html>