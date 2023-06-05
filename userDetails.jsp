
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
	margin-top: 5%;
	padding: 5%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>
	<br>
	<br>
	<br>

	<center>

		<h2 style="color: red">User Details</h2>

		<table style="width: 50%" ,border='5'>
			<tr>
				<td>User_I'D</td>
				<td>${user.uid}</td>
			</tr>
			<tr>
				<td>User_NAME</td>
				<td>${user.uname}</td>
			</tr>
			<tr>
				<td>User Gender</td>
				<td>${user.ugender}</td>
			</tr>
			<tr>
				<td>User Mobile Number</td>
				<td>${user.umn}</td>
			</tr>
			<tr>
				<td>User City</td>
				<td>${user.ucity}</td>
			</tr>
			<tr>
				<td>user pincode</td>
				<td>${user.upincode}</td>
			</tr>
			<tr>
				<td>user Email</td>
				<td>${user.uemail}</td>
			</tr>
			<tr>
				<td>user password</td>
				<td>${user.upwd}</td>
			</tr>
		</table>
		<h3>
			<a href="welcome.jsp">Home Page</a>
		</h3>
	</center>
</body>
</html>
