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
	background-color: #2C4152;
}

form{
background-color: pink;
align-content: center;
align-items: center;
}

footer{
	background-color:#2C4152;
	text-align: center;
	justify-content: center;
	padding: 10px;
	color: #FFFFFF;
}
</style>

<body>
<header>
	<div class="container-fluid">
    	<a class="navbar-brand" href="#" >
      	<img src="data:image/png;base64,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" alt="" width="30" height="24" class="d-inline-block align-text-top">
      	<b>DATA APP</b>
   		</a>
    	<a href="index.jsp"><input type="button" value="Home" style="background-color: aqua;"></a>
    	
 	</div>
</header>

	<form>	
	<div align="center">
	<br><h1>Applied Successfully</h1><br><br>
	
	<div class="col-md-5">
	<p>User Name: ${uName}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${uName}"><br>
	</div>
	<div class="col-md-5">
	<p>DOB is: ${uDob}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${uDob}"><br>
	</div>
	<div class="col-md-5">
	<p>State: ${uState}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${uState}"><br>
	</div>
	<div class="col-md-5">
	<p>Gender: ${uGender}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${uGender}"><br>
	</div>
	<div class="col-md-5">
	<p>Language: ${uLang}</p>
	<input type="text" class="form-control" id="inputEmail4" value="${uLang}"><br>
	</div><br><br>
	<h4>Thank You for Successfully Applied</h4><br>
	</div>
	</form>
	
<footer class="footer">
    <div>Designed by: Prajwal</div>
    <div>Application Name: DATA APP</div>
</footer>

</body>
</html>