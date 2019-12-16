<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit-movies</title>
<link rel="stylesheet" href="style/style.css" type="text/css">
<script type="text/javascript" src="js/script.js"></script>
</head>
<body>
	<header>
		<nav>

			<label>Movie Cruiser</label> <img alt="Movie Cruiser"
				src="file:///C:/Hemanth/final-check-master-d64d9f5767902e8eebdcc82219eaaeb26b9f8e44/final-check-master-d64d9f5767902e8eebdcc82219eaaeb26b9f8e44.zip_expanded/WebContent/images/logo.png" height="25" width="25"> <a
				href="ShowMoviesAdmin" id="movies">Movies</a>

		</nav>
	</header>
	<div class="gototable">
		<label class="lab">Edit Movies</Label>
		<form action="EditMovies" method="Post" name="moviesForm"
			onsubmit="return validateForm();">
			<div>
				<div>
					<label>Title</label>
				</div>
				<div>
					<input type="text" name="title" value="<c:out value="${movies.title }"></c:out>" id="name">
				</div>
			</div>
			<table>
				<tr>
					<td>Gross ($)</td>
					<td>Active</td>
					<td>Date of Launch</td>
					<td>Genre</td>
				</tr>
				
					<tr>
						<td><input type="text" name="gross" value="<c:out value="${movies.boxOffice }"></c:out>"></td>
						<td><input type="radio" name="active" value="Yes" ${movies.active==true?'checked':'' }> <label>Yes</label>
							<input type="radio" name="active" value='No' ${movies.active==false?'checked':'' }> <label>No</label></td>
						<td><input type="date" name="dateOfLaunch" value="<c:out value="${movies.dateOfLaunch }"></c:out> " required>
						</td>
						<td><select name="genre" >
								<option value="">Select</option>
								<option value="sciencefiction">Science Fiction</option>
								<option value="superhero">Superhero</option>
								<option value="romance">Romance</option>
								<option value="comedy">Comedy</option>
								<option value="adventure">Adventure</option>
								<option value="thriller">Thriller</option>
						</select></td>
					</tr>
				
			</table>
			<div>
				<input type="checkbox" name="hasteaser" value="free" ${movies.hasTeaser==true?'checked':'' }><label>Has
					Teaser</label>
			</div>
			<input type="submit" id="sub" value="submit" name="submit">
		</form>
	</div>
	<footer>
		<label>Copyright &copy; 2019</label>
	</footer>
</body>
</html>