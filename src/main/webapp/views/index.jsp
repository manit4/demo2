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

</head>


<body>
	<form action="login" method="post">
		<h3 style="margin-left: 400px; color: Blue; margin-top: 50px">This
			is Cohart20 Ecommerce Application</h3>
		<div style="margin-left: 450px; margin-right: 450px">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Username</label>
				<input type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" name="username">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Password</label>
				<input type="password" class="form-control"
					id="exampleInputPassword1" name="pwd">
			</div>
			<button style="margin-left: 160px" type="submit" class="btn btn-primary">Login</button><br><br>
			<a style="margin-left: 100px" href="registrationPage">New User? Register Here!!</a>
			
		</div>
		
		<input type="hidden"> 
		
	</form>
</body>
</html>