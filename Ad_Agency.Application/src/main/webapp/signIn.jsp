<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</head>

<style>
    html, body {
        height: 100%;
        margin: 0;
    }

    /* Page wrapper to use flexbox */
    .page-wrapper {
        display: flex;
        flex-direction: column;
        height: 100%;
    }

    /* Ensure content area takes available space */
    .content {
        flex: 1;
    }

    header {
        background-color: #e3f2fd;
        padding: 15px;
    }

    form {
        padding: 70px;
        background-color: pink;
        color: black;
        padding-left: 60px;
        font-weight: bolder;
    }

    footer {
        background-color: black;
        color: white;
        text-align: center;
        padding: 13px;
        position: relative;
        width: 100%;
    }

    .invalid {
        color: red;
    }

    .valid {
        color: green;
    }
</style>

<body>
    <div class="page-wrapper">
       <header>
		<nav>
			<div class="container-fluid">
				<a class="navbar-brand" href="#"> <img
					src="https://w7.pngwing.com/pngs/786/126/png-transparent-logo-contracting-photography-logo-symbol.png" alt="" width="35"
					height="35" class="d-inline-block align-text-top"> <b>Ad Agency</b>
				</a> 
				<a href="index.jsp"><button type="button" class="btn btn-primary">Home</button></a>
				<a href="signUp.jsp"><button type="button" class="btn btn-primary">SignUp</button></a> 
			</div>
		</nav>
	</header>

        <div class="content">
            <form action="login" method="POST" align="center">
                <div align="center">
                    <h1>Login Page</h1><br>
                    <div class="col-md-4">
                        <label class="form-label"><b>Email</b></label>
                        <input type="email" placeholder="Enter Email" name="email" class="form-control" id="email"
                            onchange="checkEmail()" required="required">
                        <br><br>

                        <label class="form-label"><b>Password</b></label>
                        <input type="password" placeholder="Enter Password" class="form-control" id="password"
                            onchange="checkPassword()" required="required">
                        <br><br>

                        <input type="submit" value="LogIn" class="btn btn-primary"><br>
                    </div>
                </div>
            </form>
        </div>

        <footer>
            <div>Designed by: Prajwal</div>
            <div>Application Name: Mobile Store Application</div>
        </footer>
    </div>

    <script>
        // Email validation function
        function checkEmail() {
            const mail = document.getElementById('email').value;
            const mailspan = document.getElementById('out_email');
            const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;

            if (emailRegex.test(mail)) {
                mailspan.innerHTML = 'E-Mail : ' + mail;
                mailspan.className = 'valid';
            } else {
                mailspan.innerHTML = 'Enter valid E-Mail';
                mailspan.className = 'invalid';
            }
        }

        // Password validation function
        function checkPassword() {
            const password = document.getElementById('password').value;
            const passwordspan = document.getElementById('out_password');

            if (password.length >= 8) {
                passwordspan.innerHTML = 'Password: ' + password;
                passwordspan.className = 'valid';
            } else {
                passwordspan.innerHTML = 'Password must be greater than 8 digits';
                passwordspan.className = 'invalid';
            }
        }
    </script>

</body>

</html>
