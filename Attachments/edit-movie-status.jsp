<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit-movies-status</title>
<link rel="stylesheet" href="style/style.css" type="text/css">
</head>
<body>
	<header>
		<nav>
		
			<label>Movie Cruiser</label>
			<img alt="Movie Cruiser" src="images/logo.png" height="25" width="25">
			<a href="ShowMovieListAdmin" id="Movies">Movies</a>

		</nav>
	</header>
		<div class="admin-table">
			<label>Edit Movie Status</Label>
			<c:if test="${EditMovieStatus==true}">
	<p id="p">Movie details saved successfully</p>
	</c:if>
			
		</div>
	<footer>
		<label>Copyright &copy; 2019</label>
	</footer>
</body>
</html>