<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Preference</title>
</head>
<body>

	<h4>Newsletter Preference</h4>

	<form action="PreferenceHandler" method="post">
		<table>
			<tr>
				<td>Include Promos and Offers :</td>
				<td>:<input type="checkbox" name="preference"
					<c:if test="${user.getPreference()}">checked</c:if>>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Back" /></td>
			</tr>
		</table>
	</form>
</body>
</html>