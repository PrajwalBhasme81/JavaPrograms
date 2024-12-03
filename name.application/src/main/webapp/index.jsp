<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="submit">
		<h1>Displaying Friends Names</h1>
		<input type="button" value="Search">

		<c:forEach var = "friends" begin = "1" end = "4">
         Names :<c:out value = "${friends}"/><p>
      </c:forEach>
	</form>
</body>
</html>