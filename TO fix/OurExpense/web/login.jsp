<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="assets/ico/favicon.png">

    <title>Our Expense (Sreeja Residency 402)</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="assets/css/main.css" rel="stylesheet">

    <link href="assets/css/font-awesome.min.css" rel="stylesheet">
    
    <script src="assets/js/modernizr.custom.js"></script>
    
  </head>

  <body>
      <%session.invalidate();%>

	<!-- Menu -->
	<!-- Menu -->
	<nav class="menu" id="theMenu">
		<div class="menu-wrap">
			<h1 class="logo"><a href="index.jsp#home">HOME</a></h1>
			<i class="fa fa-arrow-right menu-close"></i>
			<a href="register.jsp">Update Profile</a>
			<a href="mailto:ibwelcomesyouall@gmail.com"><i class="fa fa-envelope"></i></a>
		</div>
		
		<!-- Menu button -->
		<div id="menuToggle"><i class="fa fa-bars"></i></div>
	</nav>
		
	<!-- MAIN IMAGE SECTION -->
	<div id="headerwrap">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
					<h1>Our Expense</h1>
					<h2>Sreeja Residency, 402</h2>
					<div class="spacer"></div>
					<i class="fa fa-angle-down"></i>
				</div>
			</div><!-- row -->
		</div><!-- /container -->
	</div><!-- /headerwrap -->

	<!-- WELCOME SECTION -->
    <div class="container">
      <div class="row mt">
      	<div class="col-lg-8">
	        <h1>Proceed with Login below!</h1>
      	</div>
      </div><!-- /row -->
    </div><!-- /.container -->
    
  
	<!-- SERVICES SECTION -->
	<div id="services">
		<div class="container">
			<div class="row mt">
				<div class="col-lg-1 centered">
					<i class="fa fa-certificate"></i>
				</div>
				<div class="col-lg-3">
					<h3>Login</h3>
                                        <% String msg= request.getParameter("msg");
                                        if(msg!=null)
                                           {
                                        out.print("Invalid Username or Password!!!");
                                        } %>
					<form action="logincheck.jsp" method="get">
                                        <p>
                                           First Name:
                                           <input type="text" name="fname" required/>
                                        </p>
                                        <p>
                                            Password:
                                            <input type="password" name="pass" required/>
                                        </p>
                                        <p>
                                            <button class="btn btn-green"><input type="submit"/></button>
                                        </p>
                                    </form>
				</div>
			
			</div><!-- row -->
		</div><!-- container -->
	</div><!-- services section -->
	
	<div id="call">
		<div class="container">
			<div class="row">
				<h3>Sreeja Residency, 402</h3>
				<div class="col-lg-8 col-lg-offset-2">
					<p>A Place where we do innovations/craziness/fun etc.</p>
				</div>
			</div><!-- row -->
		</div><!-- container -->
	</div><!-- Call to action -->
        <div id="cf">
		<div class="container">
			<div class="row">
				<div class="col-lg-4">
                                    <h4><u>Home Address</u></h4>
					<br/>
					<p>
						402, 8th Cross, Sreeja Residency<br/>
						Bellandur.
                                                PIN: 560103<br/>
						P: +91 8971378176<br/>
						E: <a href="mailto:#">ibwelcomesyouall@gmail.com</a>
					</p>
				</div>
			</div><!-- row -->
		</div><!-- container -->
	</div><!-- Contact Footer -->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/main.js"></script>
	<script src="assets/js/masonry.pkgd.min.js"></script>
	<script src="assets/js/imagesloaded.js"></script>
    <script src="assets/js/classie.js"></script>
	<script src="assets/js/AnimOnScroll.js"></script>
	<script>
		new AnimOnScroll( document.getElementById( 'grid' ), {
			minDuration : 0.4,
			maxDuration : 0.7,
			viewportFactor : 0.2
		} );
	</script>
  </body>
</html>
