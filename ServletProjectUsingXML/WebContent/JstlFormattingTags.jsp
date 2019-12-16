<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="currentDate" value="<%=new java.util.Date()%>"></c:set>
	<fmt:formatDate var="currentDate" value="${currentDate }" />
	Current Date :
	<c:out value="${currentDate }"></c:out>
	<br>

	<c:set var="now" value="<%=new java.util.Date()%>"></c:set>
	<fmt:formatDate type="date" var="now" value="${now }"
		pattern="dd/MM/yyyy" />
	Format Date :
	<c:out value="${now }"></c:out>
	<br>

	<c:set var="date" value="12-08-2018"></c:set>
	<fmt:parseDate value="${date }" var="parseDate" pattern="dd-MM-yyyy"></fmt:parseDate>
	<c:out value="${parseDate }"></c:out><br>

	<c:set var="s" value="Cognizant"></c:set>
	<p>Index of z : "${fn:indexOf(s,"z")}"</p>
	<p>Length of String : "${fn:length(s)}"</p>
</body>
</html>