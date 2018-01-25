<%--
    Document   : logincheck
    Created on : Aug 30, 2016, 9:13:02 PM
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
                        <a href="summary.jsp">summary</a>
			<a href="about.jsp">About</a>
                        <a href="logout.jsp">Log Out</a>
			<a href="mailto:ibwelcomesyouall@gmail.com"><i class="fa fa-envelope"></i></a>
		</div>
		
		<!-- Menu button -->
		<div id="menuToggle"><i class="fa fa-bars"></i></div>
	</nav>
        <%
                    Calendar now = Calendar.getInstance();
                    int mm;
                    String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
                    String yhistory=request.getParameter("yhistory");
                    String mhistory=request.getParameter("mhistory");
                    for (mm=0;mm<12;mm++)
                    {
                        if(mhistory.equals(monthNames[mm]))
                        {
                            break;
                        }
                    }
                    String formattedmonth = String.format("%02d", mm+1);
                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","OurExpenseAdmin","OurExpenseAdmin");
                        Statement hstmt = connection.createStatement();
                        Statement hstmt1 = connection.createStatement();
                        ResultSet hrset=hstmt.executeQuery("select a.Valid, a.Purchasedate,a.ExpenseLogDetail,a.Price,y.FirstName, (select x.FirstName from Roommates x where x.RoommateID =CASE WHEN EXISTS ( SELECT b.ValidatorID FROM Validator_History b where a.TransactionID=b.TransactionID )THEN ( SELECT b.ValidatorID FROM Validator_History b where a.TransactionID=b.TransactionID )ELSE ( SELECT c.RejectorID FROM Rejector_History c where a.TransactionID=c.TransactionID )END) as 'Validator/Rejector' from ExpenseLog_History a, Roommates y where y.RoommateID=a.RoommateID and a.Purchasedate like '"+yhistory+"-"+formattedmonth+"-%' order by a.Purchasedate");
                        ResultSet hrset1=hstmt1.executeQuery("select SUM(Price) from ExpenseLog_History where Purchasedate like '"+yhistory+"-"+formattedmonth+"-%'");
                    %>
                    <h3><%out.print(mhistory+" ");out.print(yhistory+" ");%>Expenditure Log:</h3>
                    <table border="1">
            <tr>
                <th> Purchase Date</th>
                <th> Item Detail</th>
                <th> Price</th>
                <th> Expense Of</th>
                <th> Validated/Rejected By</th>
            </tr>
                      <%
                    while (hrset.next()) {
                        if(hrset.getString(1).equals("Y"))
                                {         
                        %>       
                        <tr bgcolor="#00FF00">      
                        <td>  <%out.println (hrset.getString(2));%> </td>
                        <td>  <%out.println (hrset.getString(3));%> </td>
                        <td>  <%out.println (hrset.getString(4));%> </td>
                        <td>  <%out.println (hrset.getString(5));%> </td>
                        <td>  <%out.println (hrset.getString(6));%> </td></tr>
                        <%
                            }
                        else if(hrset.getString(1).equals("R"))
                            {%>
                            <tr bgcolor="#FF0000">      
                            <td>  <%out.println (hrset.getString(2));%> </td>
                            <td>  <%out.println (hrset.getString(3));%> </td>
                            <td>  <%out.println (hrset.getString(4));%> </td>
                            <td>  <%out.println (hrset.getString(5));%> </td>
                            <td>  <%out.println (hrset.getString(6));%> </td></tr>
                            <%  }
                        else 
                            {%>
                            <tr>      
                            <td>  <%out.println (hrset.getString(2));%> </td>
                            <td>  <%out.println (hrset.getString(3));%> </td>
                            <td>  <%out.println (hrset.getString(4));%> </td>
                            <td>  <%out.println (hrset.getString(5));%> </td>
                            <td>  <%out.println (hrset.getString(6));%> </td></tr>
                            <%  }
                    }
                            hrset1.next();
                            %>
             <tr>
                    <td colspan="5"><%
                            String total1=hrset1.getString(1);
                            if(total1!=null)
                                    out.println("Total:"+total1);
                            else
                              out.println("Total: 0 ");  
                    %>
                    </td></tr>
                    </table>
                    <br/>
                    <%
                        hstmt.close();
                        hstmt1.close();

}catch(Exception e) {
    out.println("SQLException: " + e.getMessage() + "<BR>");
}
                    try{
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection connection1 = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","OurExpenseAdmin","OurExpenseAdmin");
                        Statement hstmt0 = connection1.createStatement();
                        ResultSet hrset0=hstmt0.executeQuery("select b.FirstName,a.TotalExpenseCost from TotalExpense_History a,Roommates b where a.RoommateID=b.RoommateID and a.Pdate like '"+yhistory+"-"+(mm+1)+"'");
                        %>
                    <h3><%out.print(mhistory+" ");out.print(yhistory+" ");%>Paid History:</h3>
                    <table border="1">
            <tr>
                <th> Roommate</th>
                <th> Amount Paid</th>
            </tr>                    
                    <%
                        while(hrset0.next())
                        {
                            %><tr bgcolor="#FFE933"><td><%out.println(hrset0.getString(1));%></td>
                            <td><%out.println(hrset0.getString(2));%></td></tr><%
                        }
                        %></table><%
                        hstmt0.close();
                    }
                    catch(Exception e) {
    out.println("SQLException: " + e.getMessage() + "<BR>");                 
                    }
                         
%>   
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
