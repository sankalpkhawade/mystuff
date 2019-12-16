<%@page import="java.lang.*"%>
<%@page import="com.cognizant.truyum.dao.MenuItemDao"%>
<%@page import="com.cognizant.truyum.dao.MenuItemDaoCollectionImpl"%>
<%@page import="com.cognizant.truyum.model.MenuItem"%>
<%@page import="java.io.IOException"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.util.ArrayList"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>menu-item-list-admin</title>
<link rel="stylesheet" href="style/style.css" type="text/css">
</head>
<body>
	<header>
		

			<label>truYum</label> <img alt="truYum"
				src="images/truyum-logo-light.png" height="25" width="25"> 
				<a class="menu" href="ShowMenuItemListAdmin">Menu</a>

		
	</header>
	
		<h1>Menu Items</h1>
		<table>

			<tr>
				<th class="c1n">Name</th>
				<th class="pr">Price</th>
				<th>Active</th>
				<th>Date of Launch</th>
				<th>Category</th>
				<th>Free Delivery</th>
				<th>Action</th>
			</tr>
			<c:forEach varStatus="loopCounter" items="${menuItemList}"
				var="menuItem">
				<tr>
					<td class="c1"><c:out value="${menuItem.name }"></c:out></td>
					<td>Rs. <c:out value="${menuItem.price }"></c:out>
					</td>
					<td><c:out value="${menuItem.active }"></c:out></td>
					<td><c:out value="${menuItem.dateOfLaunch }"></c:out></td>
					<td><c:out value="${menuItem.category }"></c:out></td>
					<td><c:out value="${menuItem.freeDelivery }"></c:out></td>
					<td><a href='ShowEditMenuItem?menuItemId=${menuItem.id }'>Edit</a></td>
				</tr>

			</c:forEach>

		</table>

	<footer>
		<label>Copyright &copy; 2019</label>
	</footer>
</body>
</html>