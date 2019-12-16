<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="DisplayEmployeeServlet" method="post">
		<table>
			<tr>
				<td><label id="id">Id</label></td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td><label id="name">Name</label></td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><label id="gender">Gender</label></td>
				<td><input type="text" name="gender"></td>
			</tr>
			<tr>
				<td><label id="dateOfBirth">Date of birth</label></td>
				<td><input type="date" name="dateOfBirth"></td>
			</tr>
			<tr>
				<td><label id="fullTimeEmployee">FullTime Employee</label></td>
				<td><input type="radio" name="fullTimeEmployee" value="Yes">Yes</td>
				<td><input type="radio" name="fullTimeEmployee" value="No">No</td>
			</tr>
			<tr>
				<td><label id="department">Department</label></td>
				<td><input type="text" name="department"></td>
			</tr>
			<tr>
				<td><label id="salary">Salary</label></td>
				<td><input type="text" name="salary"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>
