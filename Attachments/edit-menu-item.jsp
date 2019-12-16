<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit-menu-item</title>
<link rel="stylesheet" href="style/style.css" type="text/css">
<script type="text/javascript" src="js/script.js"></script>
</head>
<body>
	<header>


		<label>truYum</label> <img alt="truYum"
			src="images/truyum-logo-light.png" height="25" width="25"> <a
			class="menu" href="ShowMenuItemListAdmin" id="menu">Menu</a>


	</header>
	<h2>Edit Menu Item</h2>
	<form action="EditMenuItem" method="Post" name="menuItemForm"
		onsubmit="return validateForm();">
		<table>
			<tr>
				<th class="c1n"><label for="field-name"> Name </label></th>
			</tr>
			<tr>
				<td><input type="text" id="field-name" name="title"  value="<c:out value="${menuItem.name }"></c:out>" ></td>
			</tr>
			<tr>
				<td class="c1">Price</td>
				<td class="c1">Active</td>
				<td class="c1">Date of Launch</td>
				<td class="c1">Category</td>
			</tr>

			<tr>
				<td><input type="text" name="price"
					value="<c:out value="${menuItem.price }"></c:out>"></td>
				<td><input type="radio" name="active" value="Yes"
					${menuItem.active==true?'checked':'' }> <label>Yes</label>
					<input type="radio" name="active" value='No'
					${menuItem.active==false?'checked':'' }> <label>No</label></td>
				<td><input type="date" name="dateOfLaunch"
					value="<c:out value="${menuItem.dateOfLaunch }"></c:out> " required>
				</td>
				<td><select name="inStock">
						<option value="">
						<c:forEach var="category" items="${menuItem.category }"></c:forEach>
						<c:if test="${menuItem.category eq 'Starters'}">Starters</c:if>
						<c:if test="${menuItem.category eq 'Main Course'}">Main Course</c:if>
						<c:if test="${menuItem.category eq 'Dessert'}">Desserts</c:if>
						<c:if test="${menuItem.category eq 'Drinks'}">Drinks</c:if></option>
						
				</select></td>
			</tr>

			<tr>

				<td class="c1"><input type="checkbox" name="category" value="free"
					${menuItem.freeDelivery==true?'checked':'' }>
				<label>Free Delivery</label></td>
			</tr>
			<tr>
				<td class="c1"><input class="in" type="submit" id="sub" value="submit" name="submit"></td>
			</tr>
		</table>
	</form>

	<footer>
		<label>Copyright &copy; 2019</label>
	</footer>
</body>
</html>