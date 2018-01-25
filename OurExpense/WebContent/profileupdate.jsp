<%-- 
    Document   : OurExpense
    Created on : Aug 6, 2016, 6:07:22 PM
    Author     : Indranil Banerjee
--%>

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

    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,300,700' rel='stylesheet' type='text/css'>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    
    <script src="assets/js/modernizr.custom.js"></script>
    
  </head>

  <body>

	<!-- Menu -->
	<nav class="menu" id="theMenu">
		<div class="menu-wrap">
			<h1 class="logo"><a href="index.html#home">HOME</a></h1>
                        <i class="fa fa-arrow-right menu-close"></i>
			<a href="login.jsp">Login</a>
			<a href="mailto:ibwelcomesyouall@gmail.com"><i class="fa fa-envelope"></i></a>
		</div>
		
		<!-- Menu button -->
		<div id="menuToggle"><i class="fa fa-bars"></i></div>
	</nav>
	
	<!-- MAIN IMAGE SECTION -->
	<div id="serviceswrap">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
					<h2>Proper Update gives this site<br/>
						Smartness!!
					</h2>
				</div>
			</div><!-- row -->
		</div><!-- /container -->
	</div><!-- /headerwrap -->

	<!-- PROCESS SECTION -->
    <div class="container">
      <div class="row mt">
		  <div class="col-lg-8">
		  	<h1>Our Expense</h1>
		  	<hr>
		  	<h3><b>ADD</b></h3>
                        <p> You can add new information about yourself.</p>
		  	<br>
		  	<h3><b>MODIFY</b></h3>
		  	<p>You can modify existing information about yourself.</p>
		  	<br>
		  	<h3><b>REMOVE</b></h3>
		  	<p>You can remove the outdated/wrong information about yourself.</p>
		  	<br>
		  	<h3><b>SUGGEST</b></h3>
                        <p>You can suggest new features to improve this site !!</p><b>
                        <% 
                            HttpSession sess = request.getSession(); 
                            if(sess.getAttribute("msg")!=null);
                                out.print("Either you have provided wrong information/You are not registered !!");
                           %>
                        </b>
		  </div><!-- col-lg-8 -->
      </div><!-- /row -->
    </div><!-- /.container -->


	<!-- SERVICES SECTION -->
	<div id="services">
		<div class="container">
			<div class="row mt">
                            <form action="profileupdate1.jsp" method="get">
				<!-- Srvice 1 -->
				<div class="col-lg-1 centered">
					<i class="fa fa-certificate"></i>
				</div>
				<div class="col-lg-3">
					<h3>First Name </h3>
					<p>
                                           <input type="text" name="fname" required/>
                                        </p>
				</div>

				<!-- Srvice 2 -->
				<div class="col-lg-1 centered">
					<i class="fa fa-question-circle"></i>
				</div>
				<div class="col-lg-3">
					<h3>Password</h3>
					<p><input type="password" name="pass" required></p>
				</div>

				<!-- Srvice 3 -->
				<div class="col-lg-1 centered">
					<i class="fa fa-globe"></i>
				</div>
				<div class="col-lg-3">
					<h3>Date Of Birth</h3>
					<p><input type="date" name="dob" required/></p>
				</div>
				
				<!-- Srvice 4 -->
				<div class="col-lg-1 centered">
					<i class="fa fa-desktop"></i>
				</div>
				<div class="col-lg-3">
					<h3>Phone No.</h3>
                                        <p><input type="text" name="phno" required /></p>
				</div>

				<!-- Srvice 5 -->
				<div class="col-lg-1 centered">
					<i class="fa fa-cog"></i>
				</div>
				<div class="col-lg-3">
					<h3>Email ID</h3>
					<p><input type="email" name="email" required/></p>
				</div>
			
				<!-- Srvice 6 -->
				<div class="col-lg-1 centered">
					<i class="fa fa-heart"></i>
				</div>
				<div class="col-lg-3">
                                    <h3>Action</h3>
                                    <select name ="action">
                                        <option value="Add">Add details about you</option>
                                        <option value="Modify">Modify your details</option>
                                        <option value="Remove">Remove some details</option>
                                        <option value="Suggest">Suggest to improve this site</option>
                                    </select>                                        
				</div>
                              <input type="submit" name="Proceed"/>
                        </form>      
			</div><!-- row -->
                        
		</div><!-- container -->
	</div><!-- services section -->
	
	
	<!-- CALL TO ACTION -->
	<div id="call">
		<div class="container">
			<div class="row">
				<h3>Sreeja Residency, 402</h3>
				<div class="col-lg-8 col-lg-offset-2">
					<p>A Place where we do innovations/craziness/fun etc.</p>
				</div>
			</div><!-- row -->
		</div><!-- container -->
	</div>
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
		new AnimOnScroll( document.getElementById( 'process' ), {
			minDuration : 0.4,
			maxDuration : 0.7,
			viewportFactor : 0.2
		} );
	</script>
  </body>
</html>
	
