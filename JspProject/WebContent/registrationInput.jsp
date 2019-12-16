<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Input Page</title>
</head>
<body>
	<form action="registrationOutput.jsp" method="post">
		<table border="1">
			<tr>
				<td><label id="userName" for="user-name">Enter User
						Name</label></td>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<td><label id="password" for="password">Enter Password</label></td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td><label id="confirmPassword" for="confirm-password">Enter
						Confirm Password</label></td>
				<td><input type="text" name="confirmPassword"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="submit"></td>
				<td><input type="reset" name="reset" value="Clear"></td>
			</tr>
		</table>
	</form>
</body>
</html>