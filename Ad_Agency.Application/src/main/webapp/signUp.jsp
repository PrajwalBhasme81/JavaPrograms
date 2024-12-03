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
background-color: #e3f2fd;
padding: 15px;
}

form{
padding:20px;
background-color: silver;

}

footer{
background-color: black;
color: white;
text-align: center;
padding: 13px;
bottom: 0px;
width: 100%;
}

.valid {
	color: green;
}

.invalid {
	color: red;
}

</style>
<body>
	<header>
		<nav>
			<div class="container-fluid">
				<a class="navbar-brand" href="#"> <img
					src="https://w7.pngwing.com/pngs/786/126/png-transparent-logo-contracting-photography-logo-symbol.png" alt="" width="35"
					height="35" class="d-inline-block align-text-top"> <b>Ad Agency</b>
				</a> 
				<a href="index.jsp"><button type="button" class="btn btn-primary">Home</button></a> 
				
			</div>
		</nav>
	</header>

	<form action="submit" method="post" align = "">
	<div align = center >
	<h1>SingUp Page</h1><br>
		<div class="col-md-4" align = left>
		<label class="form-label"><b>Person Name</b></label>
		<input type="text" placeholder="Enter Name" name="personName" class="form-control" id="personName" onchange="checkPersonName()" required="required">
		<span id="out_personName"></span><br>
		<label class="form-label"><b>Company Name</b></label>
		<input type="text" placeholder="Enter Company Name" name="companyName" class="form-control" id="companyName" onchange="checkCompanyName()" required="required">
		<span id="out_companyName"></span><br>
		<label class="form-label"><b>Email</b></label>
		<input type="email" placeholder="Enter Email" name="email" class="form-control" id="email" onchange="checkEmail()" required="required">
		<span id="out_email"></span><br>
		<label class="form-label"><b>Password</b></label>
		<input type="password" placeholder="Enter Password" name="password" class="form-control" id="password" onchange="checkPassword()"  required="required">
		<span id="out_password"></span><br>
		<label class="form-label"><b>Contact Number</b></label>
		<input type="text" placeholder="Enter Contact Number" name="contact" class="form-control" id="contact" onchange="checkContactNumber()" required="required">
		<span id="out_contactnumber"></span><br>
		<label class="form-label"><b>Product Name</b></label>
		<input type="text" placeholder="Enter Product Name" name="product" class="form-control" id="product" onchange="checkProductName()" required="required">
		<span id="out_productname"></span><br>
		<label class="form-label"><b>Description</b></label>
		<input type="text" placeholder="Enter Description" name="description" class="form-control" required="required"><br>
  		</div>
		<br> <input type="submit" value="SignUp" class="btn btn-primary"> 
		<input type="reset" value="Reset" class="btn btn-primary">
		
		<div class="form-footer">
			<p>
				Already have an account? <a href="signIn.jsp">Sign In</a>
			</p>
		</div>
		
		</div>
	</form>

<footer>
	<div>Designed by: Prajwal</div>
	<div>Application Name: Mobile Store Application</div>
</footer>

<script>
		//person name
		function checkPersonName() {
			const name = document.getElementById('personName').value;
			const namespan = document.getElementById('out_personName');
			if (name.length > 3) {
				namespan.innerHTML = 'Person Name :' + name;
				namespan.className = 'valid';

			} else {
				namespan.innerHTML = 'Person Name must be greater than 3 letters';
				namespan.className = 'invalid';
			}
		}
		//company name
		function checkCompanyName() {
			const name = document.getElementById('companyName').value;
			const namespan = document.getElementById('out_companyName');
			if (name.length > 3) {
				namespan.innerHTML = 'Company Name :' + name;
				namespan.className = 'valid';

			} else {
				namespan.innerHTML = 'Company Name must be greater than 3 letters';
				namespan.className = 'invalid';
			}
		}
		//email
		function checkEmail() {
			const mail = document.getElementById('email').value;
			const mailspan = document.getElementById('out_email');
			const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/
			if (emailRegex.test(mail)) {
				mailspan.innerHTML = 'E-Mail :' + mail;
				mailspan.className = 'valid';
			} else {
				mailspan.innerHTML = 'Enter valid E-Mail'
				mailspan.className = 'invalid';
			}

		}
		//password
		function checkPassword() {
			const password = document.getElementById('password').value;
			const passwordspan = document.getElementById('out_password');
			if (password.length >= 5) {
				passwordspan.innerHTML = 'Password :' + password;
				passwordspan.className = 'valid';
			} else {
				passwordspan.innerHTML = 'Password must be greater than 8 digits';
				passwordspan.className = 'invalid';
			}
		}
		//contact number
		function checkContactNumber() {
			const contact = document.getElementById('contact').value;
			const contactspan = document.getElementById('out_contactnumber');
			if (contact.length == 10) {
				contactspan.innerHTML = 'Contact Number :' + contact;
				contactspan.className = 'valid';
			} else {
				contactspan.innerHTML = 'Enter valid Contact Number';
				contactspan.className = 'invalid';
			}
		}
		//product name
		function checkProductName() {
			const name = document.getElementById('product').value;
			const namespan = document.getElementById('out_productname');
			if (name.length > 3) {
				namespan.innerHTML = 'Product Name :' + name;
				namespan.className = 'valid';

			} else {
				namespan.innerHTML = 'Product Name must be greater than 3 letters';
				namespan.className = 'invalid';
			}
		}
		
		
		
	</script>

</body>
</html>