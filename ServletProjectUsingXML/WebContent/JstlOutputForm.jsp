<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="formObject" class="com.cts.model.FormModel"></jsp:useBean>
	<jsp:setProperty property="userName" name="formObject" />
	<jsp:setProperty property="password" name="formObject" />
	<jsp:setProperty property="confirmPassword" name="formObject" />

	<c:set var="uname" value="${formObject.getUserName() }"></c:set>
	<c:set var="pwd" value="${formObject.getPassword() }"></c:set>
	<c:set var="cpwd" value="${formObject.getConfirmPassword() }"></c:set>
	<table border="1">
		<tr>
			<td>User Name</td>
			<td>Password</td>
			<td>Confirm Password</td>
		</tr>
		<tr>
			<td><c:out value="${uname }"></c:out></td>
			<td><c:out value="${pwd }"></c:out></td>
			<td><c:out value="${cpwd }"></c:out></td>
		</tr>

	</table>
</body>
</html>