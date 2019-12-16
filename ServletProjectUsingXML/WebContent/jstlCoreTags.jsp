<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="companyname" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<companyname:out value="Welcome"></companyname:out><br>
	
	<companyname:forEach var="i" begin="1" end="10">
		<companyname:out value="${i}"></companyname:out>
	</companyname:forEach>
	<br>
	<companyname:forTokens items="1020,james,60000.00" delims="," var="emp">
		<companyname:out value="${emp}"></companyname:out>
	</companyname:forTokens>
</body>
</html>