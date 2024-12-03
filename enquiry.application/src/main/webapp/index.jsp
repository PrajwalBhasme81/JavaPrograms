<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enquiry</title>
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
      	<b>ENQUIRY</b>
   		</a>
    	<a href="index.jsp"><input type="button" value="Home" style="background-color: aqua;"></a>
 		</div>
</header>		
	
<form action="submit">
	<div align="center">
	<h1>Enquiry Form</h1><br><br>
	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Enter your Name</label>
    <input type="text" class="form-control" id="inputEmail4" name = "userName">
  	</div><br>
  	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Enter your Email</label>
    <input type="email" class="form-control" id="inputEmail4" name = "email">
  	</div><br>
	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Enter your Contact Number</label>
    <input type="tel" class="form-control" id="inputEmail4" name = "contactNumber">
  	</div><br>
  	<div class="col-md-8">
    <label for="inputEmail4" class="form-label">Description</label>
    <input type="text" class="form-control" id="inputEmail4" name = "description">
  	</div><br>
	
	<input type="reset" value="RESET" style="background-color: aqua;">
	
	<a href="success.jsp"><input type="submit" value="SUBMIT" style="background-color: aqua;"></a><br><br><br>
	</div>
</form>
	
<footer>
    <div>Designed by: Prajwal</div>
    <div>Application Name: Passport Booking</div>
</footer>
	
</body>
</html>