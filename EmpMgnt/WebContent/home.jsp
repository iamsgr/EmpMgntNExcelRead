<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<div align="center">
		<h1 style="color: green">Employee Attendance Details</h1>

		<table border="1">
			<th>ID</th>
			<th>Name</th>
			<th>Date</th>
			<th>In Time</th>
			<th>Out Time</th>
			<th>Joining Date</th>

			<c:forEach var="emp" items="${empList}">
				<tr>
					<td><c:out value="${emp.emp_id}" /></td>
					<td><c:out value="${emp.emp_name}" /></td>
					<td><c:out value="${emp.date}" /></td>
					<td><c:out value="${emp.in_time}" /></td>
					<td><c:out value="${emp.out_time}" /></td>
					<td><c:out value="${emp.join_Date}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>