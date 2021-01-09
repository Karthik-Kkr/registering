<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body style="text-align: center">
<form action="finduser" method="get">
<b>

<label for="userId">UserId</label>
<input type="number" name="userId" required><br><br>

<label for="password">Password</label>
<input type="password" name="password" required><br><br>

<button type="submit">submit</button>
</b>
</form>
</body>
</html>