<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cart</title>
<link rel="stylesheet" href="style/style.css" type="text/css">
</head>
<body>
	<header>
		
			<label>truYum</label>
			<img alt="truYum" src="images/truyum-logo-light.png" height="25" width="25">
			<a class="cart" href="ShowCart" id="menu">Cart</a>
			<a class="menu" href="ShowMenuItemListCustomer" id="menu">Menu</a>
	
	</header>
	
			<h1>Cart</h1>
				<c:if test="${removeCartItemStatus==true}">
	<h4>
			Item removed from cart successfully
		</h4>
	
	</c:if>
			<table>
				<tr>
					<th class="c1n">Name</th>
					<th class="c1n">Free Delivery</th>
					<th class="pr">Price</th>	
					<th > </th>
				</tr>
			<c:forEach varStatus="loopCounter" items="${cart.menuItemList}"
				var="menuItem">
				<tr>
					<td class="c1"><c:out value="${menuItem.name }"></c:out></td>
					<td><c:out value="${menuItem.freeDelivery }"></c:out></td>
					<td>Rs. <c:out value="${menuItem.price }"></c:out>
					<td><a href='RemoveCart?menuItemId=${menuItem.id }'>Delete</a></td>
				</tr>
			
				
				</c:forEach>
				<tr>
					<td></td>
					<td style="font-weight:bold;">Total</td>
					<td style="font-weight:bold;"><c:out value="${cart.total }"></c:out></td>
				</tr>
			</table>
		
	<footer>
		<label>Copyright &copy; 2019</label>
	</footer>
</body>
</html>