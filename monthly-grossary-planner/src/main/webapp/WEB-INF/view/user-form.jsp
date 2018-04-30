<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save User</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
		<h2>Monthly Grossary Planner - View/Modify Users</h2>
	</div>
</div>
<div id="container">
<h3>Save User</h3>
<form:form action="saveUser" modelAttribute="user" method="POST">
	<table>
		<tbody>
			<tr>
				<td><label>Username:</label></td>
				<td><form:input path="username"/></td>
			</tr>
			<tr>
				<td><label>Password:</label></td>
				<td><form:input path="password"/></td>
			</tr>
			<tr>
				<td><label>Enabled:</label></td>
				<td><form:input path="enabled"/></td>
			</tr>
			<tr>
				<td><label></label></td>
				<td><input type="submit" value="Save" class="save"/></td>
			</tr>
		</tbody>
	</table>
</form:form>
<div style="clear; both;"></div>
<p>
	<a href="${pageContext.request.contextPath}/admin/view_modify_users">Back to List</a>
</p>
</div>
</body>
</html>