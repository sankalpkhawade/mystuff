<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit-movie</title>
<link rel="stylesheet" href="style/style.css" type="text/css">
<script type="text/javascript" src="js/script.js"></script>
</head>
<body>
	<header>
		<nav>
		
			<label>Movie Cruiser</label>
			<img alt="movie cruiser" src="images/logo.png" height="25" width="25">
			<a href="ShowMovieListAdmin" id="menu">Movies</a>

		</nav>
	</header>
		<div class="go-table">
			<label class="lab">Edit Movie</Label>
			<form action="EditMovieItem" method="post" name="myForm" onsubmit="return validateForm();">
					<div>
						<div><label>Title</label></div>
						<div><input type="text" name="title" value="<c:out value="${movieItem.title }"></c:out>" id="nametext"></div>
					</div>
					<table>
						<tr>
						<td> Gross ($)</td>
						<td>Active</td>
						<td>Date of Launch</td>
						<td>Genre</td>
						</tr>
						<tr>
							<td><input type="text" name="boxOffice" value="<c:out value="${movieItem.boxOffice }"></c:out>"></td>
							<td><input type="radio" name="active" value="true" ${movieItem.active==true?'checked':'' }>
										<label>Yes</label>
								<input type="radio" name="active" value="false" ${movieItem.active==false?'checked':'' }>
										<label>No</label></td>
							<td>
							<fmt:formatDate value="${movieItem.dateOfLaunch}" var="date" pattern="dd/MM/yyyy"/>
							<input type="text" name="dateOfLaunch" value="<c:out value="${date }"></c:out>" >
							</td>
							<td>
								<select name="genre">
									<option value="${movieItem.genre }">
									<c:forEach var="genre" items="${movieItem.genre }">
									<c:if test="${genre  eq 'Science Fiction'}">Science Fiction</c:if>
									<c:if test="${genre  eq 'SuperHero'}">SuperHero</c:if>
									<c:if test="${genre  eq 'Romance'}">Romance</c:if>
									</c:forEach>
									</option>
									<option value="Science Fiction">
								<c:if test="${movieItem.genre  ne 'Science Fiction'}">Science Fiction</c:if></option>
								<option value="SuperHero">	<c:if test="${movieItem.genre  ne 'SuperHero'}">SuperHero</c:if></option>
								<option value="Romance">	<c:if test="${movieItem.genre  ne 'Romance'}">Romance</c:if></option>
									
								</select>
							</td>
						</tr>
					</table>
					<div>
						<input type="checkbox" name="hasTeaser" value="${movieItem.hasTeaser==true ?'true':'false'}" ${movieItem.hasTeaser==true?'checked':'' }><label>Has Teaser</label>
					</div>
					<input type="hidden" name="id" value="${movieItem.id}">
					<input type="submit" id="sub" value="Save" name="submit" >
			</form>
		</div>
	<footer>
		<label>Copyright &copy; 2019</label>
	</footer>
</body>
</html>