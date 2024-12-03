<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
    	<a class="navbar-brand" href="#" >
      	<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBmuUKtVoS3ilF-Rk5pERyCaI-emsPiUM1tA&s" alt="" width="30" height="24" class="d-inline-block align-text-top">
      	<b>PASSPORT</b>
   		</a>
    	<a href="index.jsp"><input type="button" value="Home" style="background-color: aqua;"></a>
    	
 	</div>
</header>	
 
<form>	
	<div align="center">
	<h1>Successfully Applied</h1><br><br>
	
	<div class="col-md-5">
	<p>User Name: ${uName}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${uName}"><br>
	</div>
	<div class="col-md-5">
	<p>Email Id: ${email}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${email}"><br>
	</div>
	<div class="col-md-5">
	<p>Father Name: ${fName}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${fName}"><br>
	</div>
	<div class="col-md-5">
	<p>Aadhar Number: ${aadhar}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${aadhar}"><br>
	</div>
	<div class="col-md-5">
	<p>PanCard Number: ${pan}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${pan}"><br>
	</div>
	<div class="col-md-5">
	<p>VoterId Number: ${voter}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${voter}"><br>
	</div>
	<div class="col-md-5">
	<p>Contact Number: ${contact}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${contact}"><br>
	</div>
	<div class="col-md-5">
	<p>Place: ${place}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${place}"><br>
	</div>
	<div class="col-md-5">
	<p>District: ${district}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${district}"><br>
	</div>
	<div class="col-md-5">
	<p>State: ${state}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${state}"><br>
	</div>
	<div class="col-md-5">
	<p>PinCode: ${pin}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${pin}"><br>
	</div>
	</div>
</form>
	
<footer class="footer">
    <div>Designed by: Prajwal</div>
    <div>Application Name: Passport Booking</div>
</footer>
</body>
</html>