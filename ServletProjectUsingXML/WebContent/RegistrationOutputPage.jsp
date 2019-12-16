<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="registrationObject"
		class="com.cts.model.RegistrationModel"></jsp:useBean>
	<jsp:setProperty property="userName" name="registrationObject" />
	<jsp:setProperty property="password" name="registrationObject" />
	<jsp:setProperty property="confirmPasswotd" name="registrationObject" />

	<jsp:include page="RegistrationInputPage.jsp"></jsp:include>

	<table border="1">
		<tr>
		<th>User Name</th>
		<th>Password</th>
		<th>Confirm Password</th>
		</tr>
		<tr>
			<td><jsp:getProperty property="userName" name="registrationObject" /></td>
			<td><jsp:getProperty property="password" name="registrationObject" /></td>
			<td><jsp:getProperty property="confirmPasswotd" name="registrationObject"/></td>
		</tr>
	</table>
</body>
</html>