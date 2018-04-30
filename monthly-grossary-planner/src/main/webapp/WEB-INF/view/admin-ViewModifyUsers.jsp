<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View/Modify Users</title>

</head>
<body>

<div id="wrapper">
	<div id="header">
		<h2>Monthly Grossary Planner - View/Modify Users</h2>
	</div>
</div>

<div id="container">
	<div id ="content">
	<!-- put new button: Add User -->
	<input type="button" value="Add User"
		onclick="window.location.href='showFormForAdd'; return false;" 
		class="add-button "/>
	<!-- add our html table here -->
		<table>
			<tr>
				<th>Username</th>
				<th>Password(Encrypted)</th>
				<th>Enabled</th>
				<th>Action</th>
			</tr>
			
			<!-- loop over and print our users -->
			<c:forEach var="tempUser" items="${users}">
			<!-- construct an "update" link with customer id -->
			<c:url var="updateLink" value="/admin/showFormForUpdate">
				<c:param name="username" value="${tempUser.username}"/>
			</c:url>
			<tr>
				<td> ${tempUser.username} </td>
				<td> ${tempUser.password} </td>
				<td> ${tempUser.enabled} </td>
				<td> <a href="${updateLink}">Update</a></td>
			</tr>
			</c:forEach>
		</table>
	</div>
</div>

</body>
</html>