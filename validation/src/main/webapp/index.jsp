<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
	<div>
	<form action="" method="post">
	<h1>Application Form</h1>
		<input type="text" placeholder="User Name" id="uName" onchange="displayUserName()"><br>
		<span id="outputUserName"></span>
		<br><br>
		
		<input type="tel" placeholder="Contact Number" id="cNumber" onchange="displayContactNumber()"><br>
		<span id="outputContactNumber"></span>
		<br><br>
		
		<input type="email" placeholder="EmailID" id="email" onchange="displayEmail()"><br>
		<span id="outputEmailId"></span>
		<br><br>
		
		<input type="text" placeholder="Address" id="address" onchange="displayAddress()"><br>
		<span id="outputAddress"></span>
		<br><br>
		
		<label>Gender</label>
		<input type="radio" id="male" name="inlineRadioOptions" required>Male
		<input type="radio" id="female" name="inlineRadioOptions" required>Female
		
		<br><br>
		<button type="button"  onclick="resetForm()" id= "reset" disabled>Reset</button>
		<button type="submit" id="submit" disabled="disabled">Submit</button>
	</form>
	</div>
</body>

<script type="text/javascript" >
	function displayUserName() {
	const name = document.getElementById('uName').value;
		if(name.length >= 2)
			{
			document.getElementById('outputUserName').innerHTML = "User Name: "+name;
			}
		else
			{
			document.getElementById('outputUserName').innerHTML = "Name length should be greater then 2";
			}
		checkFormValidity();
		checkFormValiditation()
	}
	
	
	function displayContactNumber() {
		let number = document.getElementById('cNumber').value;
		if(number.length == 10)
			{
			document.getElementById('outputContactNumber').innerHTML = "Contact Number: " +number;
			}
		else
			{
			document.getElementById('outputContactNumber').innerHTML = "Number should be 10 digits";
			}
		checkFormValidity();
		checkFormValiditation()
	}
	
	function displayEmail() {
		const email = document.getElementById('email').value;
		const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
		const valid = emailPattern.test(email);
		if(valid){
			document.getElementById('outputEmailId').innerHTML = "Email Id: " +email;
			}
		else
			{
			document.getElementById('outputEmailId').innerHTML = "Enter proper Email";
			}
		checkFormValidity();
		checkFormValiditation()
	}
	
	function displayAddress() {
		const address = document.getElementById('address').value;
		if(address.length >= 25)
			{
			document.getElementById('outputAddress').innerHTML = "Address: "+address;
			}
		else
			{
			document.getElementById('outputAddress').innerHTML = "Address length should be greater then 25";
			}
		checkFormValidity();
		checkFormValiditation()
	}
	
	
	function checkFormValidity(){
	    const nameValid = document.getElementById('outputUserName').innerHTML.includes("User Name: ");
	    const phoneValid = document.getElementById('outputContactNumber').innerHTML.includes("Contact Number: ");
	    const emailValid = document.getElementById('outputEmailId').innerHTML.includes("Email Id: ");
	    const addressValid = document.getElementById('outputAddress').innerHTML.includes("Address: ");

	    if(nameValid && emailValid && phoneValid && addressValid) {
	        document.getElementById('submit').disabled = false;
	    } else {
	        document.getElementById('submit').disabled = true;
	    }
	    
	}
	
	
	function checkFormValiditation(){
		const nameValid = document.getElementById('outputUserName').innerHTML.includes("User Name: ");
	    const phoneValid = document.getElementById('outputContactNumber').innerHTML.includes("Contact Number: ");
	    const emailValid = document.getElementById('outputEmailId').innerHTML.includes("Email Id: ");
	    const addressValid = document.getElementById('outputAddress').innerHTML.includes("Address: ");

	    if(nameValid && emailValid && phoneValid && addressValid) {
	        document.getElementById('reset').disabled = false;
	    } else {
	        document.getElementById('reset').disabled = true;
	    }
	    
	}
	
	function resetForm(){
	    document.getElementById('uName').value = '';
	    document.getElementById('cNumber').value = '';
	    document.getElementById('email').value = '';
	    document.getElementById('address').value = '';
	    
	    document.getElementById('outputUserName').innerHTML = '';
	    document.getElementById('outputContactNumber').innerHTML = '';
	    document.getElementById('outputEmailId').innerHTML = '';
	    document.getElementById('outputAddress').innerHTML = '';
	
	    document.getElementById('male').checked = false;
	    document.getElementById('female').checked = false;
	    
	    document.getElementById('submit').disabled = true;
	}
</script>

</html>