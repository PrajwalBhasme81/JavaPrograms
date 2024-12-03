<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="click">
	<label for="inputEmail4" class="form-label">Enter your Name</label>
    <input type="text" class="form-control" id="inputEmail4" name = "userName">
  	<p>User Name: ${uName}</p>
  	
  	<input type="submit" value="SUBMIT" style="background-color: aqua;"><br><br><br>
</form>
</body>
</html>