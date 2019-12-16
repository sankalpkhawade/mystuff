<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Info</title>
</head>
<body>
<h2>Personal Information</h2>

<form action="PersonalInformationHandler" method="post">
<table>
<tr>
<td>Name</td>
<td>:<input type="text" name="name" value="<c:out value="${user.name}"/>"/></td>
</tr>

<tr>
<td>Email Address:</td>
<td>:<input type="text" name="email" value="<c:out value="${user.email}"/>"/></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="Next"/></td>
</tr>

</table>
</form>


</body>
</html>