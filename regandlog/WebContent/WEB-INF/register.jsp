<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register your details</title>
<style>

</style>
</head>
<body style="text-align: center">
<form onsubmit="return verifyDetails()" action="addUser" method="post">
		<b> 
		<label for="name">Name</label>
		<input type="text" name="name" required><br><br>
		
		<label for="userId">UserId</label>
		<input type="number" name="userId" required><br><br>
		
		<label for="Mobile No">Mobile No</label> 
		<input type="number" name="mobileNo" id="mobileno" size="10" required>
		<span id="mobileMessage" style="color: red"> </span><br><br>
 
		<label for="email">EmailId</label> 
		<input type="email" name="email" required><br><br>
		
		<label for="password">Password</label> 
		<input type="password" name="password" id="pswd" required><br><br>
		 
		<label for="confirmPassword">confirmPassword</label> 
		<input type="password" name="confirmPassword" id="confirmpw" required>
		<span id="message" style="color: red"> </span><br><br>
		
		<br> <input type="submit" value="Register">
		</b>
</form>
</body>
<script type="text/javascript">
	function verifyDetails() {
		var pw = document.getElementById("pswd").value;
		var cnfrm_pw = document.getElementById("confirmpw").value;
		var mob = document.getElementById("mobileno").value;
		if (pw != cnfrm_pw) {
			document.getElementById("message").innerHTML = "Passwords not matching";
			return false;
		}

		if(mob.length != 10){
			document.getElementById("mobileMessage").innerHTML = "Number should be 10 digits";
			return false;
			}
		
	}
</script>
</html>