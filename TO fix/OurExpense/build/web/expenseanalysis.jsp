<%-- 
    Document   : expenseanalysis
    Created on : Aug 26, 2016, 6:40:57 PM
    Author     : user
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
  
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="assets/ico/favicon.png">

    <title>Our Expense (Sreeja Residency 402)</title>
    <link href="assets/css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="assets/css/main.css" rel="stylesheet">

    <link href="assets/css/font-awesome.min.css" rel="stylesheet">

    <script src="assets/js/modernizr.custom.js"></script>
    <body>

	<nav class="menu" id="theMenu">
		<div class="menu-wrap">
			<h1 class="logo"><a href="index.jsp#home">LINK</a></h1>
			<i class="fa fa-arrow-right menu-close"></i>
                        <a href="summary.jsp">Summary</a>
			<a href="about.jsp">About</a>
                        <a href="logout.jsp">Log Out</a>
			<a href="mailto:ibwelcomesyouall@gmail.com"><i class="fa fa-envelope"></i></a>
		</div>
		
		<!-- Menu button -->
		<div id="menuToggle"><i class="fa fa-bars"></i></div>
	</nav>
                        <div id="sp">
		<div class="container">
			<div class="row">
				<h2>Hello <%
                                    HttpSession sess = request.getSession(); 
                         out.println(sess.getAttribute("fname"));
                                %>!</h2>
			</div><!-- row -->
		</div><!-- /container -->
	</div>
        	<!-- WELCOME SECTION -->
    <div class="container">
      <div class="row mt centered">
      	<div class="col-lg-8 col-lg-offset-2">
            <%
                       Calendar now = Calendar.getInstance();
                       int year=now.get(Calendar.YEAR);
                       int month=now.get(Calendar.MONTH)+1;
                       String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
                       String monthname=monthNames[month-1];
                       String formattedmonth = String.format("%02d", month);
                         try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","OurExpenseAdmin","OurExpenseAdmin");
                         Statement vcheck = connection.createStatement();
                       ResultSet rsetv = vcheck.executeQuery("select * from ExpenseLog where Valid='N' and RoommateID not in ('"+sess.getAttribute("roomID")+"')");
                       if(rsetv.next())
                       {%>
                       <h1><b> One of your friend has recently inserted expense detail. Please validate it ..</b></h1>
                       <br/>
                       <p><u>To validate, click on Accept/Reject!! </u></p> 
                      <% }
                       ResultSet rsetv1 = vcheck.executeQuery("select b.*,a.FirstName from ExpenseLog b,Roommates a where b.Valid='N' and b.RoommateID not in ('"+sess.getAttribute("roomID")+"') and a.RoommateID=b.RoommateID");
                       %>
                     
                           <%
                       while (rsetv1.next())
                       {
                           %><h4><%out.println(rsetv1.getString(7)+" has claimed that he purchased "+rsetv1.getString(4)+" costs "+rsetv1.getString(5)+".");%></h4>
                           <form action ="validate.jsp" method="post">
                               <input type="hidden" name="tid" value="<%out.print(rsetv1.getString(2));%>"/>
                               <input type="hidden" name="validID" value="<%out.print(rsetv1.getString(1));%>"/>
                               <input type="hidden" name="price" value="<%out.print(rsetv1.getString(5));%>"/>
                               <input type="hidden" name="roomID" value="<%out.print(sess.getAttribute("roomID"));%>"/>
                               <input type="submit" name="authentic" value="Accept" />
                           <input type="submit" name="authentic" value="Reject"/>
                           </form>
                           
                      <% }
                           %>
                           <h1><b>
                               The Page is UNDER CONSTRUCTION, visit after few days.
                                            <%
                        Statement stmt = connection.createStatement(); 
                        Statement stmt1 = connection.createStatement();
                        Statement stmtsum = connection.createStatement();
                        Statement stmt2 = connection.createStatement();
                        Statement stmtsum1 = connection.createStatement();
                        ResultSet rset1 = stmt.executeQuery("select * from TotalExpense where RoommateID='"+sess.getAttribute("roomID")+"'" );
                        if (rset1.next()) {
                        //out.print (rset1.getString(2)); // Print col 1
                        }
                        else
                        {
                           out.print ("0"); 
                        }
                    %>
                               </b></h1>
      	</div>
      </div><!-- /row -->
    </div><!-- /.container -->
 <div id="lg">
		<div class="container">
			<div class="row">
				<div class="col-lg-5 col-lg-offset-1 desc">
					<h3>Your Expenditure Log :</h3>
                    <%
                    ResultSet rset2 = stmt1.executeQuery("select * from ExpenseLog where RoommateID='"+sess.getAttribute("roomID")+"' and Purchasedate like '"+year+"-"+formattedmonth+"-%' order by Purchasedate");
                    ResultSet rsetsum=stmtsum.executeQuery("select SUM(Price) from ExpenseLog where RoommateID='"+sess.getAttribute("roomID")+"' and Purchasedate like '"+year+"-"+formattedmonth+"-%'");
                    %>
                    <table border="1">
            <tr>
                <th> Purchase Date</th>
                <th> Item Detail</th>
                <th> Price</th>
            </tr>
                    <%
                    while (rset2.next()) {
                     %>
              <tr>      
            <td>  <%out.println (rset2.getString(3));%> </td>
            <td>  <%out.println (rset2.getString(4));%> </td>
            <td>  <%out.println (rset2.getString(5));%> </td></tr>
        
                    <%
                    }
                    rsetsum.next();%>
                    <tr>
                    <td colspan="3"><%
                    String total=rsetsum.getString(1);
                    if(total!=null)
                    out.println("Total:"+total);
                    else
                     out.println("Total:  0");   
                    %>
                    </td></tr>
                    </table>
					
				</div>
				
				<div class="col-lg-5 col-lg-offset-1 desc">
                                    <%
                    //ResultSet rset3 = stmt2.executeQuery("select * from ExpenseLog where Purchasedate like '"+year+"-"+formattedmonth+"-%' ");
                    ResultSet rset3=stmt2.executeQuery("select a.Valid, a.Purchasedate,a.ExpenseLogDetail,a.Price,y.FirstName, (select x.FirstName from Roommates x where x.RoommateID =CASE WHEN EXISTS ( SELECT b.ValidatorID FROM Validator b where a.TransactionID=b.TransactionID )THEN ( SELECT b.ValidatorID FROM Validator b where a.TransactionID=b.TransactionID )ELSE ( SELECT c.RejectorID FROM Rejector c where a.TransactionID=c.TransactionID )END) as 'Validator/Rejector' from ExpenseLog a, Roommates y where y.RoommateID=a.RoommateID and a.Purchasedate like '"+year+"-"+formattedmonth+"-%' order by a.Purchasedate");
                    ResultSet rset4=stmtsum1.executeQuery("select SUM(Price) from ExpenseLog where Purchasedate like '"+year+"-"+formattedmonth+"-%'");
                    %>
                    <h3>Global Expenditure Log:</h3>
                    <table border="2">
            <tr>
                <th> Purchase Date</th>
                <th> Item Detail</th>
                <th> Price</th>
                <th> Expense Of</th>
                <th> Validated/Rejected By</th>
            </tr>
                      <%
                    while (rset3.next()) {
                        if(rset3.getString(1).equals("Y"))
                                {         
                        %>       
                        <tr bgcolor="#00FF00">      
                        <td>  <%out.println (rset3.getString(2));%> </td>
                        <td>  <%out.println (rset3.getString(3));%> </td>
                        <td>  <%out.println (rset3.getString(4));%> </td>
                        <td>  <%out.println (rset3.getString(5));%> </td>
                        <td>  <%out.println (rset3.getString(6));%> </td></tr>
                        <%
                            }
                        else if(rset3.getString(1).equals("R"))
                            {%>
                            <tr bgcolor="#FF0000">      
                            <td>  <%out.println (rset3.getString(2));%> </td>
                            <td>  <%out.println (rset3.getString(3));%> </td>
                            <td>  <%out.println (rset3.getString(4));%> </td>
                            <td>  <%out.println (rset3.getString(5));%> </td>
                            <td>  <%out.println (rset3.getString(6));%> </td></tr>
                            <%  }
                        else 
                            {%>
                            <tr>      
                            <td>  <%out.println (rset3.getString(2));%> </td>
                            <td>  <%out.println (rset3.getString(3));%> </td>
                            <td>  <%out.println (rset3.getString(4));%> </td>
                            <td>  <%out.println (rset3.getString(5));%> </td>
                            <td>  <%out.println (rset3.getString(6));%> </td></tr>
                            <%  }
                    }
                            rset4.next();
                            %>
             <tr>
                    <td colspan="5"><%
                            String total1=rset4.getString(1);
                            if(total1!=null)
                                    out.println("Total:"+total1);
                            else
                              out.println("Total: 0 ");  
                    %>
                    </td></tr>
                    </table>
                    <br/>
                    <%
                        stmt.close();
                        stmt1.close();
                        stmt2.close();

}catch(Exception e) {
    out.println("SQLException: " + e.getMessage() + "<BR>");
}
                         
%>
                                </div>
			</div><!-- row -->
		</div><!-- container -->
	</div>
	<div id="call">
		<div class="container">
			<div class="row">
                            <h3>  Want to input your expense for today, then fill the form as below:-</h3>
                            <div class="col-lg-8 col-lg-offset-2">
        <form action="todaysexpense.jsp" method="get">
            <input type="hidden" name="roomID" value="<%out.print(sess.getAttribute("roomID"));%>"/>
            <p>
                Purchase Date: <input type="date" name="pdate" required/>
            </p>
            <p>
                Item Details: <input type="text" name="idel" required/>
            </p>
            <p>
                Total Cost: <input type="text" name="tcost" required/>
            </p>
            <p>
             <button class="btn btn-green"><input type="submit"/></button>
            </p>
            
        </form>
				</div>
			</div><!-- row -->
		</div><!-- container -->
	</div>
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

