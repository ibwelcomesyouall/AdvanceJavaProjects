<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>

<head>
	<title>Monthly Grossary Planner Home Page</title>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
<div class="container">
	<h1>Monthly Grossary Planner </h1>
		<!--  Role(s): <security:authentication property="principal.authorities"/> -->
	<hr>
	<p class="bg-success">
	<b>Welcome <security:authentication property="principal.username"/> !!</b>
	</p>
	<div class="container">
	  <h3>Access Your urls</h3>
	  <ul class="nav nav-pills">
	  <security:authorize access="hasRole('USER')">
	    <li><a href="${pageContext.request.contextPath}/user/dashboard">DashBoard</a></li>
	    <li><a href="${pageContext.request.contextPath}/user/generate_shopping_list">Generate Shopping List</a></li>
	    <li><a href="${pageContext.request.contextPath}/user/update_shopping_details">Update Shopping Details</a></li>
	    </security:authorize>
	    <li><a href="${pageContext.request.contextPath}/visitor">Some WebSite Enhancement Request</a></li>
	    <security:authorize access="hasRole('ADMIN')">
	    <li><a href="${pageContext.request.contextPath}/admin/view_modify_users">View/Modify Users</a></li>
	    <li><a href="${pageContext.request.contextPath}/admin/update_item_list">Update Item List</a></li>
	    </security:authorize>
	  </ul>
	</div>
	
	<div class="container">
  		<h2>User Interaction Details</h2>
  		<button type="button" class="btn btn-primary">Total Users  <span class="badge">3</span></button>
  		<button type="button" class="btn btn-success">Users Logged-in  <span class="badge">1</span></button>    
  		<button type="button" class="btn btn-danger">Users Logged-out  <span class="badge">2</span></button>        
	<br/>
	<br/>
	
	<div class="progress">
    <div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar" aria-valuenow="33" aria-valuemin="0" aria-valuemax="100" style="width:40%">
      33% (Utilization)
    </div>
  	</div>
  	</div>
  	
  	<div class="container">
  		<div class="panel panel-default">
    	<div class="panel-heading">This website include many important features related to monthly grossary planning</div>
    	<div class="panel-body"> 
    	<dl>
		    <dt>Features:</dt>
		    <dd>- define</dd>
		    <dd>- define</dd>
		    <dt>Strategy</dt>
		    <dd>- define</dd>
		    <dd>- define</dd>
		    <dt>Goal</dt>
		    <dd>- define</dd>
		    <dd>- define</dd>
  		</dl> 
    	</div>
    	<div class="panel-footer">Want to use it, then get register. Contact <mark>Indranil Banerjee</mark></div>
  		</div>
	</div>
	
	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Logout" />
	
	</form:form>
	</div>

</body>

</html>