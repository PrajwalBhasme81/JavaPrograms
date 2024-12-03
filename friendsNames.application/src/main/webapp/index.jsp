<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   
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

body{
	background-color: pink;
}

form{
	text-align: center;
	padding: 17%;
	}

footer{
	background-color:#131A22;
	text-align: center;
	padding: 10px;
	color: #DDDDDD;
}

</style>
<body>

<header>
  <div class="container-fluid" style="background-color: #0F1111;">
    <a class="navbar-brand" href="#">
      <img src="data:image/png;base64,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" alt="" width="30" height="24" class="d-inline-block align-text-top">
      <b>FINDS APP</b>
    </a>
    <a href="index.jsp"><input type="button" value="Home" style="background-color: aqua;"></a>
   
  </div>
</header>

	<form action="submit">
		<input type="submit" value="Search">	
	</form>
	
	<h4 align= "center">
		<c:forEach items="${friends}" var="item">
   			 ${item}<br>
		</c:forEach>
	</h4>
		
<footer>
    <div>Designed by: Prajwal</div>
    <div>Application Name: Finds App</div>
</footer>

</body>
</html>