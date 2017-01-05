<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>Login page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body {
	background-image: url("https://www.colourbox.com/preview/14719046-stack-of-colorful-books-in-shopping-card-on-an-isolated-white-background-concept-of-online-shopping.jpg");
	background-repeat: no-repeat;
	background-size: 600px;
}

div.login {
	text-align: center;
	border: 0px;
	margin-top: 100px;
	margin-left: 500px;
	margin-right: 500px;
	padding: 20px;
}

a {
	text-decoration: none;
}
</style>
</head>
<body>
<div class="login">
		<h1 id="login">Login</h1>
		<form action="LoginSuccess" method="POST">
			<table style="margin: 40px;">
				<tr>
					<td><label for="userid">User Id</label></td>
					<td>:</td>
					<td><input type="text" placeholder="userid" name="userid"></td>
				</tr>
				<tr>
					<td><label for="password">Password</label></td>
					<td>:</td>
					<td><input type="password" name="pass"></td>
				</tr>
			</table>
			<a href="index"> <input type="submit" value="login"></a> <a
				href="registerHere"> <input type="button" value="Register"></a>
		</form>
	</div>
</body>
</html>