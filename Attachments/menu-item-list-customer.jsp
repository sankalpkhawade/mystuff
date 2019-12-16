<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>menu-item-list-cutomer</title>
<link rel="stylesheet" href="style/style.css" type="text/css">
</head>
<body>
	<header>
		<nav>

			<label>truYum</label> <img alt="truYum"
				src="images/truyum-logo-light.png" height="25" width="25"> 
				<a class="cart" href="ShowCart" id="menu">Cart</a> 
				<a class="menu" href="ShowMenuItemListCustomer" id="menu">Menu</a>
	

		</nav>
	</header>
	<h1>Menu Items</h1>
		<c:if test="${addCartStatus==true}">
	<h4>Item added to cart successfully</h4>
	
	</c:if>
		<table>
			<tr>
				<th class="c1n">Name</th>
				<th>Free Delivery</th>
				<th class="pr">Price</th>
				<th>Category</th>
				<th>Action</th>
			</tr>
			<c:forEach varStatus="loopCounter" items="${menuItemList}"
				var="menuItem">
				<tr>
					<td class="c1"><c:out value="${menuItem.name }"></c:out></td>
					<td><c:out value="${menuItem.price }"></c:out></td>
					<td><c:out value="${menuItem.active }"></c:out></td>
					<td><c:out value="${menuItem.dateOfLaunch }"></c:out></td>
					<td><c:out value="${menuItem.category }"></c:out></td>
					<td><c:out value="${menuItem.freeDelivery }"></c:out></td>
					<td><a href='AddtoCart?menuItemId=${menuItem.id}'>Add to
							Cart</a></td>
				</tr>

			</c:forEach>
		</table>
	
	<footer>
		<label>Copyright &copy; 2019</label>
	</footer>
</body>
</html>