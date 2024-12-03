<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Ad Agency Details</title>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
     
        html, body {
            height: 100%;
            margin: 0;
            padding: 0;
            background-color: orange;
        }
        
        .page-wrapper {
            display: flex;
            flex-direction: column;
            height: 100%;
        }

        .content {
            flex: 1; 
            
        }

        header {
            background-color: #e3f2fd;
            padding: 15px;
        }

        footer {
            background-color: black;
            color: white;
            text-align: center;
            padding: 13px;
            bottom: 0;
            width: 100%;
        }

        .table {
            margin-top: 20px;
        }

        .table-dark th {
            background-color: #343a40;
            color: white;
        }
    </style>
</head>
<body>

<div class="page-wrapper">
    <header>
        <nav>
            <div class="container-fluid">
                <a class="navbar-brand" href="#"> 
                    <img src="https://w7.pngwing.com/pngs/786/126/png-transparent-logo-contracting-photography-logo-symbol.png" alt="" width="35" height="35" class="d-inline-block align-text-top">
                    <b>Ad Agency</b>
                </a> 
                <a href="index.jsp"><button type="button" class="btn btn-primary">Home</button></a> 
            </div>
        </nav>
    </header>
    
    <div class="content container my-5">
        <h1 class="text-center mb-4">Ad Agency Details</h1>
        <div class="d-flex justify-content-end mb-3">
            <form action="view" method="get">
                <input type="submit" value="Submit" class="btn btn-primary">
            </form>
        </div>
        <table class="table table-bordered table-striped table-hover">
            <thead class="table-dark">
                <tr>
                    <th>Person Name</th>
                    <th>Company Name</th>
                    <th>Email</th>
                    <th>Phone Number</th>
                    <th>Product Name</th>
                    <th>Description</th>
                    <th>Changes</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="dto" items="${read}">
                    <tr>
                        <td>${dto.personName}</td>
                        <td>${dto.companyName}</td>
                        <td>${dto.email}</td>
                        <td>${dto.contact}</td>
                        <td>${dto.productName}</td>
                        <td>${dto.description}</td>
                        <td>
                            <a href="delete?id=${dto.id}" class="btn btn-danger">Delete</a>
                            <a href="update?id=${dto.id}" class="btn btn-success">Update</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <footer>
        <div>Designed by: Prajwal</div>
        <div>Application Name: Mobile Store Application</div>
    </footer>
</div>

</body>
</html>
