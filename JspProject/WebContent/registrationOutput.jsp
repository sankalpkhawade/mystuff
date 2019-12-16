<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Output Page</title>
</head>
<body>
	<%
		String uname = request.getParameter("userName");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("confirmPassword");
		// 	out.print("User Name : "+uname);
		// 	out.print("Password : "+password);
		// 	out.print("Confirm-Password : "+cpassword);
	%>
	<table border="1">
		<tr>
			<th>User Name</th>
			<th>Password</th>
			<th>Confirm Password</th>
		</tr>
		<tr>
			<td><%=uname%></td>
			<td><%=password%></td>
			<td><%=cpassword%></td>
		</tr>
	</table>
</body>
</html>