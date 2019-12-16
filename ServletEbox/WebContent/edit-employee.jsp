<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" --%>
<%-- 	pageEncoding="ISO-8859-1"%> --%>
<%-- <%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<!-- <title>Insert title here</title> -->
<!-- </head> -->
<!-- <body> -->
<!-- 	<h4>Employee Details</h4> -->
<!-- 	<form method="post" action="DisplayEmployeeServlet"> -->
<!-- 		<table> -->
<!-- 			<tr> -->
<!-- 				<td><label>Id</label></td> -->
<%-- 				<td>:<core:out value="${e.getId() }"></core:out></td> --%>
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td><label>Name</label></td> -->
<!-- 				<td>:<input type="text" name="name" -->
<%-- 					value="<core:out value="${e.getName() }"></core:out>"></td> --%>
<!-- 			</tr> -->
<!-- 			<tr> -->
				<td><label>Gender</label></td>
				<td>:<input type="radio" name="gender" value="Male"
					<core:if test="${e.getGender() eq 'Male' }">checked</core:if>>Male
					<input type="radio" name="gender" value="Female"
					<core:if test="${e.getGender() eq 'Female' }">checked</core:if>>Female
				</td>
			</tr>
			<tr>
				<td><label>Date Of Birth</label></td>
				<td>:<input type="text" name="name"
					value="<core:out value="${e.getDate() }"></core:out>"></td>
			</tr>
			<tr>
				<td><label>Fulltime Employee</label></td>
				<td><input type="checkbox" name="fulltime" value="fulltime"
					<core:if test="${e.getFulltime() eq 'True' }">checked</core:if>></td>
			</tr>
			<tr>
				<td><label>Department</label></td>
				<td>:<select name="department">
						<option value="InformationTechnology">
							<core:forEach var="department" items="${e.getDepartment() }"></core:forEach>
							<core:if test="${e.getDepartment() eq 'Information Technology' }">Information Technology</core:if></option>
						</select></td>
			</tr>
			<tr>
				<td><label>Salary</label></td>
				<td>:<input type="text" name="salary"
					value="<core:out value="${e.getSalary() }"></core:out>"></td>
			</tr>
			<tr>
			<td></td>
				<td><input type="submit" name="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String date = request.getParameter("dateOfBirth");
		String gender = request.getParameter("gender");
		String fullTime = request.getParameter("fullTimeEmployee");
		String department = request.getParameter("department");
		String salary = request.getParameter("salary");
	%>
	<h1>Employee Details Verification</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Gender</th>
		</tr>
		<tr>
			<td>
				<%
					out.print(id);
				%>
			</td>
			<td>
				<%
					out.print(name);
				%>
			</td>
			<td>
				<%
					out.print(gender);
				%>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<th>Date of Birth</th>
			<th>FullTime Employee</th>
			<th>Department</th>
		</tr>
		<tr>
			<td>
				<%
					out.print(date);
				%>
			</td>
			<td>
				<%
					out.print(fullTime);
				%>
			</td>
			<td>
				<%
					out.print(department);
				%>
			</td>
		</tr>
		<tr>
			<th>salary</th>
		</tr>
		<tr>
			<td>
				<%out.print(salary); %>
			</td>
		</tr>
	</table>
</body>
</html>
